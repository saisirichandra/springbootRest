package com.example.demorest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@RequestMapping("students")
	public List<Student> getStudents(){
		
		return studentService.getStudents();
		
	}
//	@RequestMapping("/students/{foo}")	
//	public Student getStudent(@PathVariable("foo") int id) {

	@RequestMapping("/students/{id}")   
	public Student getStudent(@PathVariable int id) { 
		return  studentService.getStudent(id);
	}
	@RequestMapping(method = RequestMethod.POST, value ="students")
	public void addStudent(@RequestBody Student student) {
		System.out.println("controllers add student");
		studentService.addStudent(student);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "students/{id}")
	public void updateStudent(@RequestBody Student student, @PathVariable int id) {
		studentService.updateStudent(student,id);
	}
	@GetMapping("/")
	public String home() {
		return ("<h1>welcome home</h1>");
	}
	
	@GetMapping("/admin")
	public String admin() {
		return ("<h1>welcome admin</h1>");
	}
	
	@GetMapping("/user")
	public String user() {
		return ("<h1>welcome user</h1>");
	}

}