package com.store.store.controllers.products;

import com.store.store.entities.products.BrandEntity;
import com.store.store.services.products.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BrandController {
    @Autowired
    private BrandService service;

    @GetMapping("")
    public ResponseEntity<?> getAll(){
        try {
            BrandEntity brand = new BrandEntity("test");
            return ResponseEntity.status(HttpStatus.OK).body(service.save(brand));
        }catch(Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("\"error\":" + e.getMessage());
        }
    }
}
