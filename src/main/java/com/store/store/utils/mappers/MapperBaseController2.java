package com.store.store.utils.mappers;

import com.store.store.DTOs.BaseEntityDTO;
import com.store.store.DTOs.reponses.ResponseDTO;
import com.store.store.DTOs2.BaseSavedDTO;
import com.store.store.entities.BaseEntity;
import lombok.Getter;
import org.springframework.data.domain.Page;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class MapperBaseController2<E extends BaseEntity, UnsavedDTO, SavedDTO extends BaseSavedDTO> {
    private @Getter MapperBaseControllerTypes2 mapperTypes;

    public MapperBaseController2(Class<?> baseControllerClass) {
        mapperTypes = new MapperBaseControllerTypes2(baseControllerClass);
    }

    public ResponseDTO mapToDTOs(Page<E> entities, String query) {
        Page<SavedDTO> entitiesDTO = entities.map(mapperTypes::mapToDTO);
        return new ResponseDTO(entitiesDTO.getContent(), entitiesDTO, query);
    }

    public ResponseDTO mapToDTO(E entity) {
        SavedDTO entityDTO = mapperTypes.mapToDTO(entity);
        return new ResponseDTO(entityDTO);
    }

    public class MapperBaseControllerTypes2 {
        private Mapper mapper = null;
        private Type entityType = null;
        private Type unsavedDTO = null;
        private Type savedDTO = null;

        public MapperBaseControllerTypes2(Class<?> baseControllerClass) {
            mapper = new Mapper();
            try {
                String canonicalName = baseControllerClass.getCanonicalName();
                Type[] types = ((ParameterizedType) Class.forName(canonicalName).getGenericSuperclass()).getActualTypeArguments();
                entityType = types[0];
                unsavedDTO = types[2];
                savedDTO = types[3];
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }

        public E mapToEntity(UnsavedDTO unsavedDTO) {
            return mapper.map(unsavedDTO, entityType);
        }

        public E mapToEntity(SavedDTO savedDTO) {
            return mapper.map(savedDTO, entityType);
        }

        public SavedDTO mapToDTO(BaseEntity entity) {
            return mapper.map(entity, savedDTO);
        }
    }
}
