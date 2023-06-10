package com.harshaabeyvickrama.studentmanagementsystem.repository;

import com.harshaabeyvickrama.studentmanagementsystem.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
}
