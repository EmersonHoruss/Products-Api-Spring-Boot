package com.store.store.services.products;

import com.store.store.entities.products.BrandEntity;
import com.store.store.exceptions.ResourceNotFoundException;
import com.store.store.services.BaseService;
import org.springframework.stereotype.Service;

@Service
public class BrandService extends BaseService<BrandEntity> {
    @Override
    public BrandEntity findById(Long id) {
        return baseRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(BrandEntity.class, id));
    }
}
