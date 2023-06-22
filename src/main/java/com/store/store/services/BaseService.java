package com.store.store.services;

import com.store.store.entities.BaseEntity;
import com.store.store.entities.products.ProductEntity;
import com.store.store.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;

import javax.transaction.Transactional;

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
    public E save(E entity) {
        baseRepository.save(entity);
        return getById(entity.getId());
    }

    @Transactional
    public E update(E entity) {
        getById(entity.getId());
        return save(entity);
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
