package com.data.Student.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.data.Student.ResourceNotFoundException;
import com.data.Student.Model.Student;
import com.data.Student.Repository.StudentRepository;
import com.data.Student.Services.StudentService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@Autowired
	private StudentRepository studentRepository;

	@PostMapping("student")
	public Student saveStudent(@RequestBody Student data) {
		return studentService.save(data);
	}
	

	@GetMapping("student")

	public List<Student> fetchDepartmentList() {
		return studentService.fetchStudentList();
	}

	@DeleteMapping("{id}")
	public void delete(@PathVariable Integer id) {
	System.out.println(" student is deleted");
	studentService.delete(id);}
	
	@CrossOrigin("*")
	@PutMapping("student/{id}")
	public Student updatestudent(@PathVariable int id, @RequestBody Student req)
	{
		return studentService.updatestudent(id, req);
		
	}
	
	
	
	
	
//	
//	@PutMapping("update/{id}")
//	public Student updatestudent(@PathVariable int id ,@RequestBody Student req) {
//		
//		return studentService.updatestudent(id, req);
//	}
//	
////	 Student student = studentRepository.findById(id)
//    .orElseThrow(() -> new ResourceNotFoundException("Student not exist with id :" + id));
//	 
//	 student.setName(studentDetails.getName());
//	 student.setEmail(studentDetails.getEmail());
//	 student.setMobilenumber(studentDetails.getMobilenumber());
//	 
//	 Student updatedStudent=studentRepository.save(student);
//	 return ResponseEntity.ok(updatedStudent);
	
//	@PutMapping("/student/{id}")
//	public ResponseEntity<Student> updatestudent(@PathVariable int id, @RequestBody Student updatedStudent) {
//	    Student student = studentRepository.findById(id)
//	            .orElseThrow(() -> new ResourceNotFoundException("Student not exist with id :" + id));
//
//	    student.setName(updatedStudent.getName());
//	    student.setEmail(updatedStudent.getEmail());
//	    
//	    Student updatedStudentEntity = studentRepository.save(student);
//	    return ResponseEntity.ok(updatedStudentEntity);
//	    }
}
