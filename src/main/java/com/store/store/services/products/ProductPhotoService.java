package com.store.store.services.products;

import com.store.store.entities.products.ProductPhotoEntity;
import com.store.store.exceptions.ResourceNotFoundException;
import com.store.store.services.BaseService;
import org.springframework.stereotype.Service;

@Service
public class ProductPhotoService extends BaseService<ProductPhotoEntity> {
    @Override
    public ProductPhotoEntity findById(Long id) {
        return baseRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(ProductPhotoEntity.class, id));
    }
}
