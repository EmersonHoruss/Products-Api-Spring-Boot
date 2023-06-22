package com.store.store.controllers.products;

import com.store.store.DTOs.entities.products.TypeDTO;
import com.store.store.constants.ProductURLConstant;
import com.store.store.controllers.BaseController;
import com.store.store.entities.products.TypeEntity;
import com.store.store.services.products.TypeService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(ProductURLConstant.RESOURCE_TYPE)
public class TypeController extends BaseController<TypeEntity, TypeService, TypeDTO> {
}
