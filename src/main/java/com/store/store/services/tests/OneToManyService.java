package com.store.store.services.tests;

import com.store.store.entities.tests.OneToManyEntity;
import com.store.store.exceptions.ResourceNotFoundException;
import com.store.store.services.BaseService;
import org.springframework.stereotype.Service;

@Service
public class OneToManyService extends BaseService<OneToManyEntity> {
    @Override
    public OneToManyEntity findById(Long id) {
        return baseRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(OneToManyEntity.class, id));
    }
}
