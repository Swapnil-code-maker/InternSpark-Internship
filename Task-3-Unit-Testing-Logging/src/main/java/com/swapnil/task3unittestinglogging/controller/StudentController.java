package com.swapnil.task3unittestinglogging.controller;

import com.swapnil.task3unittestinglogging.entity.Student;
import com.swapnil.task3unittestinglogging.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private static final Logger logger =
            LoggerFactory.getLogger(StudentController.class);

    @Autowired
    private StudentService studentService;

    // GET all students
    @GetMapping
    public List<Student> getStudents() {

        logger.info("GET request received for all students");

        return studentService.getAllStudents();
    }

    // ADD student
    @PostMapping
    public Student addStudent(@RequestBody Student student) {

        logger.info("POST request received for student: {}", student.getName());

        return studentService.addStudent(student);
    }
}