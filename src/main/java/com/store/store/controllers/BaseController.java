package com.store.store.controllers;

import com.store.store.DTOs.entities.BaseDTO;
import com.store.store.DTOs.reponses.ResponseDTO;
import com.store.store.DTOs.tests.ProductTestDTO;
import com.store.store.entities.BaseEntity;
import com.store.store.entities.tests.ProductEntityTest;
import com.store.store.services.BaseService;

import com.store.store.utils.mappers.MapperBaseController;
import com.store.store.utils.specification.Specification;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.data.domain.Pageable;

import javax.validation.Valid;

public abstract class BaseController<E extends BaseEntity, S extends BaseService<E>, DTO extends BaseDTO> {
    @Autowired
    private S service;
    private MapperBaseController<E, DTO> mapper = new MapperBaseController(getClass());

    @GetMapping("")
    public ResponseEntity<ResponseDTO> get(@Valid @RequestParam(required = false) String query, Pageable pageable) {
        Page<E> entities = service.get(new Specification<E>(query), pageable);
        return ResponseEntity.status(HttpStatus.OK).body(mapper.mapToDTOs(entities, query));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ResponseDTO> getById(@Valid @PathVariable Long id) {
        E entity = service.getById(id);
        return ResponseEntity.status(HttpStatus.OK).body(mapper.mapToDTO(entity));
    }

    @PostMapping("")
    public Object create(@Valid @RequestBody DTO entityDTO) {
        E entity = mapper.getMapperTypes().mapToEntity(entityDTO);
        entity = service.save(entity);

        //return ResponseEntity.status(HttpStatus.OK).body(mapper.mapToDTO(savedEntity));
        return entity;
    }

    @PutMapping("")
    public ResponseEntity<ResponseDTO> update(@Valid @RequestBody DTO entityDTO) {
        E entity = mapper.getMapperTypes().mapToEntity(entityDTO);
        E savedEntity = service.update(entity);
        return ResponseEntity.status(HttpStatus.OK).body(mapper.mapToDTO(savedEntity));
    }

    @DeleteMapping("/{id}/{soft}")
    public ResponseEntity<ResponseDTO> delete(
            @Valid @PathVariable Long id,
            @Valid @PathVariable boolean soft) {
        System.out.println("soft: " + soft);
        E entity = null;
        if (soft) {
            entity = service.deleteSoft(id);
        } else {
            entity = service.deleteHard(id);
        }
        return ResponseEntity.status(HttpStatus.OK).body(mapper.mapToDTO(entity));
    }

    @PatchMapping("")
    public Object testingMappings(@RequestBody ProductTestDTO productTestDTO){
        ModelMapper mapper = new ModelMapper();
        //mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
        ProductEntityTest productEntityTest = mapper.map(productTestDTO, ProductEntityTest.class);
        //mapper.getConfiguration().isFieldMatchingEnabled();
        //mapper.createTypeMap(ProductTestDTO.class, ProductEntityTest.class);
        //mapper.validate();
        //return null;
        return productEntityTest;
    }
}
