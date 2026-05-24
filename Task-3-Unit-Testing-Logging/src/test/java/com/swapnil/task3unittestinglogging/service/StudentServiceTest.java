package com.swapnil.task3unittestinglogging.service;

import com.swapnil.task3unittestinglogging.entity.Student;
import com.swapnil.task3unittestinglogging.repository.StudentRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class StudentServiceTest {

    @Mock
    private StudentRepository studentRepository;

    @InjectMocks
    private StudentService studentService;

    public StudentServiceTest() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGetAllStudents() {

        List<Student> students = Arrays.asList(
                new Student(1L, "Swapnil", "swapnil@gmail.com", "CSE")
        );

        when(studentRepository.findAll()).thenReturn(students);

        List<Student> result = studentService.getAllStudents();

        assertEquals(1, result.size());
        assertEquals("Swapnil", result.get(0).getName());
    }
}