package com.store.store.controllers.products;

import com.store.store.DTOs.products.productPhoto.ProductPhotoSaveDTO;
import com.store.store.DTOs.products.productPhoto.ProductPhotoShowDTO;
import com.store.store.DTOs.products.productPhoto.ProductPhotoUpdateDTO;
import com.store.store.constants.ProductURLConstant;
import com.store.store.controllers.BaseController;
import com.store.store.entities.products.ProductPhotoEntity;
import com.store.store.services.products.ProductPhotoService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(ProductURLConstant.RESOURCE_PRODUCT_PHOTO)
public class ProductPhotoController extends BaseController<ProductPhotoEntity, ProductPhotoService, ProductPhotoSaveDTO,
        ProductPhotoShowDTO, ProductPhotoUpdateDTO> {
}
