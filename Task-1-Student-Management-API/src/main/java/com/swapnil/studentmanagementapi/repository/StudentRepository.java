package com.swapnil.studentmanagementapi.repository;

import com.swapnil.studentmanagementapi.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}