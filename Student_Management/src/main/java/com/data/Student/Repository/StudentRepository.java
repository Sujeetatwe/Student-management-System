package com.data.Student.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.data.Student.Model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
