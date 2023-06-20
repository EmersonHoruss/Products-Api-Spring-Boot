package com.store.store.controllers.products2;

import com.store.store.DTOs2.products.brand.BrandSavedDTO;
import com.store.store.DTOs2.products.brand.BrandUnsavedDTO;
import com.store.store.constants.ProductURLConstant;
import com.store.store.controllers.BaseController2;
import com.store.store.entities.products.BrandEntity;
import com.store.store.services.products.BrandService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(ProductURLConstant.RESOURCE_BRAND2)
public class BrandController2 extends BaseController2<BrandEntity, BrandService, BrandUnsavedDTO, BrandSavedDTO> {
}
