package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
	@Query("select u from Student u where u.firstName like %?1% or u.lastName like %?1%")
	public List<Student> findStudentByName(String name);
}
