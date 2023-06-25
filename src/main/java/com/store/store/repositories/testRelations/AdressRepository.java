package com.store.store.repositories.testRelations;

import com.store.store.entities.testRelations.Adress;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdressRepository extends JpaRepository<Adress, Long> {
}
