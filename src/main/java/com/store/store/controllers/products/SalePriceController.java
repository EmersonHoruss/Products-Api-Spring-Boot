package com.store.store.controllers.products;

import com.store.store.DTOs.entities.products.SalePriceDTO;
import com.store.store.constants.ProductURLConstant;
import com.store.store.controllers.BaseController;
import com.store.store.entities.products.SalePriceEntity;
import com.store.store.services.products.SalePriceService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(ProductURLConstant.RESOURCE_SALE_PRICE)
public class SalePriceController extends BaseController<SalePriceEntity, SalePriceService, SalePriceDTO> {
}
