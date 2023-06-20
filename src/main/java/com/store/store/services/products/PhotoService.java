package com.store.store.services.products;

import com.store.store.entities.products.PhotoEntity;
import com.store.store.exceptions.ResourceNotFoundException;
import com.store.store.services.BaseService;
import org.springframework.stereotype.Service;

@Service
public class PhotoService extends BaseService<PhotoEntity> {
    @Override
    public PhotoEntity findById(Long id) {
        return baseRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(PhotoEntity.class, id));
    }
}
