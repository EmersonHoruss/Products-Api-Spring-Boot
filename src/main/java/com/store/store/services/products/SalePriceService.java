package com.store.store.services.products;

import com.store.store.entities.products.SalePriceEntity;
import com.store.store.exceptions.ResourceNotFoundException;
import com.store.store.services.BaseService;
import org.springframework.stereotype.Service;

@Service
public class SalePriceService extends BaseService<SalePriceEntity> {
    @Override
    public SalePriceEntity findById(Long id) {
        return baseRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(SalePriceEntity.class, id));
    }
}
