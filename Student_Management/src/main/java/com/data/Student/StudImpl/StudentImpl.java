package com.data.Student.StudImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.data.Student.Model.Student;
import com.data.Student.Repository.StudentRepository;
import com.data.Student.Services.StudentService;

@Service
public class StudentImpl implements StudentService {

	@Autowired
	StudentRepository studentRepository;

	private final StudentRepository studentrepository;

	@Autowired
	public StudentImpl(StudentRepository studentRepository) {
		this.studentrepository = null;
		this.studentRepository = studentRepository;
	}

	@Override
	public Student save(Student data) {
		// TODO Auto-generated method stub
		return studentRepository.save(data);
	}

	@Override
	public List<Student> fetchStudentList() {
		// TODO Auto-generated method stub
		return (List<Student>) studentRepository.findAll();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		studentRepository.deleteById(id);
		;
	}

	@Override
	public Student updatestudent(int id, Student req) {
		// TODO Auto-generated method stub
		Student student= studentRepository.findById(id).get();
		student.setEmail(req.getEmail());
		student.setName(req.getName());
		student.setMobilenumber(req.getMobilenumber());
		return studentRepository.save(student);
	}

	@Override
	public Student findById(int id) {
		// TODO Auto-generated method stub
		return studentRepository.findById(id).get();
	}

	//another way to update the api
//	@Override
//	public Optional<Student> updateStudent(int id, Student updatedStudent) {
//		return studentRepository.findById(id).map(student -> {
//			student.setName(updatedStudent.getName());
//			student.setEmail(updatedStudent.getEmail());
//			return studentRepository.save(student);
//		});
//	}

//	public List<Student> getAllStundents() {
//		List<Student> Stud = new ArrayList<Student>();
//		
//		return  studentRepository.findAll();
//	}

}
