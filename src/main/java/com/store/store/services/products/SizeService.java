package com.store.store.services.products;

import com.store.store.entities.products.SizeEntity;
import com.store.store.exceptions.ResourceNotFoundException;
import com.store.store.services.BaseService;
import org.springframework.stereotype.Service;

@Service
public class SizeService extends BaseService<SizeEntity> {
    @Override
    public SizeEntity findById(Long id) {
        return baseRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(SizeEntity.class, id));
    }
}
