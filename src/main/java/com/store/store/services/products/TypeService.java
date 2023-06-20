package com.store.store.services.products;

import com.store.store.entities.products.TypeEntity;
import com.store.store.exceptions.ResourceNotFoundException;
import com.store.store.services.BaseService;
import org.springframework.stereotype.Service;

@Service
public class TypeService extends BaseService<TypeEntity> {
    @Override
    public TypeEntity findById(Long id) {
        return baseRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(TypeEntity.class, id));
    }
}
