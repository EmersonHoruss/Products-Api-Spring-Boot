package com.store.store.controllers.products;

import com.store.store.DTOs.entities.products.ProductDTO;
import com.store.store.constants.ProductURLConstant;
import com.store.store.controllers.BaseController;
import com.store.store.entities.products.ProductEntity;
import com.store.store.services.products.ProductService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(ProductURLConstant.RESOURCE_PRODUCT)
public class ProductController extends BaseController<ProductEntity, ProductService, ProductDTO> {
}
