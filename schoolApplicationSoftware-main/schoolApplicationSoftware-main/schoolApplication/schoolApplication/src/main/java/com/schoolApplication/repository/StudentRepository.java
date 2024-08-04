package com.schoolApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.schoolApplication.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

}
