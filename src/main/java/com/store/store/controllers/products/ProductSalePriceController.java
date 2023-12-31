package com.store.store.controllers.products;

import com.store.store.DTOs.entities.products.ProductSalePriceDTO;
import com.store.store.constants.ProductURLConstant;
import com.store.store.controllers.BaseController;
import com.store.store.entities.products.ProductSalePriceEntity;
import com.store.store.services.products.ProductSalePriceService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(ProductURLConstant.RESOURCE_PRODUCT_SALE_PRICE)
public class ProductSalePriceController extends BaseController<ProductSalePriceEntity, ProductSalePriceService,
        ProductSalePriceDTO> {
}
