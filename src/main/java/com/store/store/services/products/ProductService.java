package com.store.store.services.products;

import com.store.store.entities.products.ProductEntity;
import com.store.store.exceptions.ResourceNotFoundException;
import com.store.store.services.BaseService;
import org.springframework.stereotype.Service;

@Service
public class ProductService extends BaseService<ProductEntity> {
    @Override
    public ProductEntity findById(Long id) {
        return baseRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(ProductEntity.class, id));
    }
}
