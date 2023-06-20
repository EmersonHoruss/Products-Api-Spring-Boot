package com.store.store.controllers.products2;

import com.store.store.DTOs2.products.product.ProductSavedDTO;
import com.store.store.DTOs2.products.product.ProductUnsavedDTO;
import com.store.store.constants.ProductURLConstant;
import com.store.store.controllers.BaseController2;
import com.store.store.entities.products.ProductEntity;
import com.store.store.services.products.ProductService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(ProductURLConstant.RESOURCE_PRODUCT2)
public class ProductController2 extends BaseController2<ProductEntity, ProductService, ProductUnsavedDTO,
        ProductSavedDTO> {
}
