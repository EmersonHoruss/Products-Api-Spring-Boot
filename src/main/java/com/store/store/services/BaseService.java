package com.store.store.services;

import com.store.store.entities.BaseEntity;
import com.store.store.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

public class BaseService <E extends BaseEntity> {
    @Autowired
    protected BaseRepository<E> baseRepository;

    @Transactional
    public List<E> find() throws Exception {
        try {
            List<E> entities = baseRepository.findAll();
            return entities;
        }catch(Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Transactional
    public E findById(Long id) throws Exception {
        try {
            Optional<E> entityOptional = baseRepository.findById(id);
            return entityOptional.get();
        }catch(Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Transactional
    public E save(E entity) throws Exception {
        try {
            entity = baseRepository.save(entity);
            return entity;
        }catch(Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Transactional
    public E update(Long id, E entity) throws Exception {
        try {
            baseRepository.findById(id).get();
            return baseRepository.save(entity);
        }catch(Exception e) {
            throw new Exception(e.getMessage());
        }
    }


    @Transactional
    public E softDelete(Long id) throws Exception {
        try {
            Optional<E> entityOptional = baseRepository.findById(id);
            E entity = entityOptional.get();
            entity.setActivated(true);
            entity = baseRepository.save(entity);
            return entity;
        }catch(Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Transactional
    public E hardDelete(Long id) throws Exception {
        try {
            Optional<E> entityOptional = baseRepository.findById(id);
            E entity = baseRepository.getById(id);
            baseRepository.deleteById(id);
            return entity;
        }catch(Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
