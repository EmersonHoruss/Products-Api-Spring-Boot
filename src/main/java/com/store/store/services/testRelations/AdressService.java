package com.store.store.services.testRelations;

import com.store.store.repositories.testRelations.AdressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdressService {
    @Autowired
    private AdressRepository repository;
}
