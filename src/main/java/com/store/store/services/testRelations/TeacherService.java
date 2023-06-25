package com.store.store.services.testRelations;

import com.store.store.repositories.testRelations.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherService {
    @Autowired
    private TeacherRepository repository;
}
