package com.store.store.services.tests;

import com.store.store.entities.tests.RootEntity;
import com.store.store.exceptions.ResourceNotFoundException;
import com.store.store.services.BaseService;
import org.springframework.stereotype.Service;

@Service
public class RootService extends BaseService<RootEntity> {
    @Override
    public RootEntity findById(Long id) {
        return baseRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(RootEntity.class, id));
    }
}
