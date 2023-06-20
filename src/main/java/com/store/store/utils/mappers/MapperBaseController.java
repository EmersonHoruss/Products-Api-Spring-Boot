package com.store.store.utils.mappers;

import com.store.store.DTOs.BaseEntityDTO;
import com.store.store.DTOs.reponses.ResponseDTO;
import com.store.store.entities.BaseEntity;
import lombok.Getter;
import lombok.ToString;
import org.springframework.data.domain.Page;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

@ToString
public class MapperBaseController<E extends BaseEntity> {

    private @Getter MapperBaseControllerTypes mapperTypes;

    public MapperBaseController(Class<?> baseControllerClass) {
        mapperTypes = new MapperBaseControllerTypes(baseControllerClass);
    }

    public ResponseDTO mapToDTOs(Page<E> entities, String query) {
        Page<BaseEntityDTO> entitiesDTO = entities.map(mapperTypes::mapToDTO);
        return new ResponseDTO(entitiesDTO.getContent(), entitiesDTO, query);
    }

    public ResponseDTO mapToDTO(E entity) {
        BaseEntityDTO entityDTO = mapperTypes.mapToDTO(entity);
        return new ResponseDTO(entityDTO);
    }

    public ResponseDTO mapToEntity(BaseEntityDTO entityDTO) {
        E entity = mapperTypes.mapToEntity(entityDTO);
        return new ResponseDTO(entity);
    }

    public class MapperBaseControllerTypes {
        private Mapper mapper = null;
        private Type entityType = null;
        private Type showDTOType = null;

        public MapperBaseControllerTypes(Class<?> baseControllerClass) {
            mapper = new Mapper();
            try {
                String canonicalName = baseControllerClass.getCanonicalName();
                Type[] types = ((ParameterizedType) Class.forName(canonicalName).getGenericSuperclass()).getActualTypeArguments();
                entityType = types[0];
                showDTOType = types[3];
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }

        public E mapToEntity(BaseEntityDTO entityDTO) {
            return mapper.map(entityDTO, entityType);
        }

        public BaseEntityDTO mapToDTO(BaseEntity entity) {
            return mapper.map(entity, showDTOType);
        }
    }
}
