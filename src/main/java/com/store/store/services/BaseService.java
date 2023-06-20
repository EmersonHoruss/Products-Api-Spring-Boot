package com.store.store.services;

import com.store.store.entities.BaseEntity;
import com.store.store.exceptions.ResourceNotFoundException;
import com.store.store.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;

import javax.transaction.Transactional;

import java.util.NoSuchElementException;
import java.util.Optional;

public abstract class BaseService<E extends BaseEntity> {
    @Autowired
    protected BaseRepository<E> baseRepository;

    public Page<E> get(Specification<E> specification, Pageable pageable) {
        try {
            Page<E> page = baseRepository.findAll(specification, pageable);
            return new PageImpl<E>(page.getContent(), pageable, page.getTotalElements());
        } catch (RuntimeException ex) {
            throw ex;
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    public E getById(Long id) {
        return findById(id);
    }

    @Transactional
    public E create(E entity) {
        return baseRepository.save(entity);
    }

    @Transactional
    public E update(E entity) {
        findById(entity.getId());
        return baseRepository.save(entity);
    }


    @Transactional
    public E deleteSoft(Long id) {
        E entity = findById(id);
        entity.setActivated(false);
        return baseRepository.save(entity);
    }

    @Transactional
    public E deleteHard(Long id) {
        E entity = findById(id);
        baseRepository.deleteById(id);
        return entity;
    }

    public abstract E findById(Long id);
}
