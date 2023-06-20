package com.store.store.services.tests;

import com.store.store.entities.tests.ManyToOneEntity;
import com.store.store.exceptions.ResourceNotFoundException;
import com.store.store.services.BaseService;
import org.springframework.stereotype.Service;

@Service
public class ManyToOneService extends BaseService<ManyToOneEntity> {
    @Override
    public ManyToOneEntity findById(Long id) {
        return baseRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(ManyToOneEntity.class, id));
    }
}
