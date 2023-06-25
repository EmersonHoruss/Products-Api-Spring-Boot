package com.store.store.controllers.testRelations;

import com.store.store.constants.ProductURLConstant;
import com.store.store.entities.testRelations.Teacher;
import com.store.store.repositories.testRelations.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("teacher")
public class TeacherController {
    @Autowired
    private TeacherRepository repository;

    @GetMapping("")
    public Object get(){
        return repository.findAll();
    }

    @PostMapping("")
    public Object create(@RequestBody Teacher teacher){
        return repository.save(teacher);
    }
}
