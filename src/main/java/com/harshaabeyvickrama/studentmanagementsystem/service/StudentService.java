package com.harshaabeyvickrama.studentmanagementsystem.service;

import com.harshaabeyvickrama.studentmanagementsystem.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;

public interface StudentService {
    Student saveStudent(Student student);

    List<Student> getAllStudents();

    Student getStudentById(Long id);

    Student updateStudent(Long id, Student updatedStudent);

    boolean deleteStudentById(Long id);
}
