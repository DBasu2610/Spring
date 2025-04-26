package com.example.demo.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;

import java.util.ArrayList;
import java.util.List;


// import org.springframework.http.HttpStatus;
// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;





@RestController
@RequestMapping("/api")
public class StudentRestController {
    List<Student> students = new ArrayList<>();
    

    @GetMapping("/students")
    public List<Student> getMethodName() {
        
        students.add(new Student("John", "Doe"));
        students.add(new Student("Mary,", "Public"));
        students.add(new Student("Ajay", "Rao"));
        return students;
    }
    

    @GetMapping("/students/{studentID}")
    public Student getStudentById(@PathVariable int studentID) {
        
        students.add(new Student("John", "Doe"));
        students.add(new Student("Mary,", "Public"));
        students.add(new Student("Ajay", "Rao"));
        if(studentID >= students.size() || studentID < 0) {
            throw new StudentNotFoundException("Student id not found - " + studentID);
        }
        return students.get(studentID);
    }


    


    

    
}
