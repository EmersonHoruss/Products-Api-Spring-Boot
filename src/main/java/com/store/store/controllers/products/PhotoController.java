package com.store.store.controllers.products;

import com.store.store.DTOs.products.photo.PhotoSaveDTO;
import com.store.store.DTOs.products.photo.PhotoShowDTO;
import com.store.store.DTOs.products.photo.PhotoUpdateDTO;
import com.store.store.constants.ProductURLConstant;
import com.store.store.controllers.BaseController;
import com.store.store.entities.products.PhotoEntity;
import com.store.store.services.products.PhotoService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(ProductURLConstant.RESOURCE_PHOTO)
public class PhotoController extends BaseController<PhotoEntity, PhotoService, PhotoSaveDTO, PhotoShowDTO, PhotoUpdateDTO> {
}
