package com.store.store.repositories.testRelations;

import com.store.store.entities.testRelations.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {
}
