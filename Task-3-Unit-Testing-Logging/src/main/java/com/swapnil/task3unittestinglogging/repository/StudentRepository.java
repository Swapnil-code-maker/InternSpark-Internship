package com.swapnil.task3unittestinglogging.repository;

import com.swapnil.task3unittestinglogging.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}