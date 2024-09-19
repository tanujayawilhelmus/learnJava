package com.example.demo.controller;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.StudentService;
import com.example.demo.entity.*;

@RestController
@RequestMapping("/api")
public class StudentController {

	@Autowired
	private StudentService studentService;

	@GetMapping("/students")
	@PreAuthorize("hasRole('client_user')")
	public ResponseEntity<List<Student>> getAllStudents() {
		return new ResponseEntity<List<Student>>(studentService.getAllStudents(), HttpStatus.OK);
	}
	
	@GetMapping("/students/findByName/{name}")
	@PreAuthorize("hasRole('client_user')")
	public ResponseEntity<List<Student>> getStudentsByName(@PathVariable String name) {
		return new ResponseEntity<List<Student>>(studentService.getStudentsByName(name), HttpStatus.OK);
	}
	
}
