package com.swapnil.databasemigrationapi.controller;

import com.swapnil.databasemigrationapi.entity.Student;
import com.swapnil.databasemigrationapi.repository.StudentRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentRepository repository;

    public StudentController(StudentRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Student> getAllStudents() {
        return repository.findAll();
    }
}