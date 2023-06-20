package com.store.store.services.products;

import com.store.store.entities.products.ProductSalePriceEntity;
import com.store.store.exceptions.ResourceNotFoundException;
import com.store.store.services.BaseService;
import org.springframework.stereotype.Service;

@Service
public class ProductSalePriceService extends BaseService<ProductSalePriceEntity> {
    @Override
    public ProductSalePriceEntity findById(Long id) {
        return baseRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(ProductSalePriceEntity.class, id));
    }
}
