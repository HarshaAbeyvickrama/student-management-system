package com.harshaabeyvickrama.studentmanagementsystem.service;

import com.harshaabeyvickrama.studentmanagementsystem.entity.Student;
import com.harshaabeyvickrama.studentmanagementsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentServiceImpl(StudentRepository repository) {
        studentRepository = repository;
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student getStudentById(Long id) {
        return studentRepository.findById(id).orElse(null);
    }

    @Override
    public Student updateStudent(Long id, Student updatedStudent) {
        Student student = studentRepository.findById(id).orElse(null);
        if (student != null) {
            // Update the student properties with the new information
            student.setName(updatedStudent.getName());
            student.setAge(updatedStudent.getAge());
            student.setGender(updatedStudent.getGender());
            student.setDateOfBirth(updatedStudent.getDateOfBirth());
            student.setAddress(updatedStudent.getAddress());
            student.setEmail(updatedStudent.getEmail());
            student.setPhoneNumber(updatedStudent.getPhoneNumber());
            student.setEnrollmentDate(updatedStudent.getEnrollmentDate());
            student.setCourse(updatedStudent.getCourse());

            // Save the updated student
            return studentRepository.save(student);
        } else {
            return null;
        }
    }

    @Override
    public boolean deleteStudentById(Long id) {
        if (studentRepository.existsById(id)) {
            studentRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }
}
