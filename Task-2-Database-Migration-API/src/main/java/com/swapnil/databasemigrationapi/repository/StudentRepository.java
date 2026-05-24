package com.swapnil.databasemigrationapi.repository;

import com.swapnil.databasemigrationapi.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}