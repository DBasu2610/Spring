 package com.example.cruddemo.dao;

import java.util.List;

import com.example.cruddemo.entity.Student;

public interface StudentDAO {

    void save(Student student);
    Student findById(Integer id);
    List<Student> findAll();
    List<Student> findByLastName(String lastName);
    void update(Student student);
    void deleteById(Integer id);
    int deleteAll();
}