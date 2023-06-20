package com.store.store.controllers.products;

import com.store.store.DTOs.products.brand.BrandSaveDTO;
import com.store.store.DTOs.products.brand.BrandShowDTO;
import com.store.store.DTOs.products.brand.BrandUpdateDTO;
import com.store.store.constants.ProductURLConstant;
import com.store.store.controllers.BaseController;
import com.store.store.entities.products.*;
import com.store.store.services.products.BrandService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(ProductURLConstant.RESOURCE_BRAND)
public class BrandController extends BaseController<BrandEntity, BrandService, BrandSaveDTO, BrandShowDTO,
        BrandUpdateDTO> {
}
