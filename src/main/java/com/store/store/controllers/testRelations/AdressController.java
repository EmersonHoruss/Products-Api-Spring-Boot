package com.store.store.controllers.testRelations;

import com.store.store.constants.ProductURLConstant;
import com.store.store.entities.testRelations.Adress;
import com.store.store.entities.testRelations.Teacher;
import com.store.store.repositories.testRelations.AdressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("adress")
public class AdressController {
    @Autowired
    private AdressRepository repository;

    @GetMapping("")
    public Object get(){
        return repository.findAll();
    }

    @PostMapping("")
    public Object create(@RequestBody Adress adress){
        Adress adress1 = repository.save(adress);
        System.out.println(adress1);
        System.out.println("souted"+repository.findById((long) adress1.getId()));
        return adress1;
    }
}
