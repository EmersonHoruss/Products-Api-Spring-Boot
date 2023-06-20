package com.store.store.controllers.products2;

import com.store.store.DTOs2.products.size.SizeSavedDTO;
import com.store.store.DTOs2.products.size.SizeUnsavedDTO;
import com.store.store.constants.ProductURLConstant;
import com.store.store.controllers.BaseController2;
import com.store.store.entities.products.SizeEntity;
import com.store.store.services.products.SizeService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(ProductURLConstant.RESOURCE_SIZE2)
public class SizeController2 extends BaseController2<SizeEntity, SizeService, SizeUnsavedDTO, SizeSavedDTO> {
}
