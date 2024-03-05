package com.data.Student.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.data.Student.Model.Student;

@Service
public interface StudentService {

	public Student save(Student data);

	List<Student> fetchStudentList();

	public void delete(int id);

	public Student updatestudent(int id, Student data);

	public Student findById(int id);

}
