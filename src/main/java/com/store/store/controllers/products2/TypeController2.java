package com.store.store.controllers.products2;

import com.store.store.DTOs2.products.type.TypeSavedDTO;
import com.store.store.DTOs2.products.type.TypeUnsavedDTO;
import com.store.store.constants.ProductURLConstant;
import com.store.store.controllers.BaseController2;
import com.store.store.entities.products.TypeEntity;
import com.store.store.services.products.TypeService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(ProductURLConstant.RESOURCE_TYPE2)
public class TypeController2 extends BaseController2<TypeEntity, TypeService, TypeUnsavedDTO, TypeSavedDTO> {
}
