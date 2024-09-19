package com.example.demo.service;

import java.util.*;
import com.example.demo.entity.*;

public interface StudentService {
	public List<Student> getAllStudents();
	public List<Student> getStudentsByName(String name);
}
