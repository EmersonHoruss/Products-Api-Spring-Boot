package com.store.store.controllers.products;

import com.store.store.DTOs.products.size.SizeSaveDTO;
import com.store.store.DTOs.products.size.SizeShowDTO;
import com.store.store.DTOs.products.size.SizeUpdateDTO;
import com.store.store.constants.ProductURLConstant;
import com.store.store.controllers.BaseController;
import com.store.store.entities.products.SizeEntity;
import com.store.store.services.products.SizeService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(ProductURLConstant.RESOURCE_SIZE)
public class SizeController extends BaseController<SizeEntity, SizeService, SizeSaveDTO, SizeShowDTO, SizeUpdateDTO> {
}
