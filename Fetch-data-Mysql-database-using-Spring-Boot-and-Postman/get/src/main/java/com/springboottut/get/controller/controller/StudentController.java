package com.springboottut.get.controller.controller;

import com.springboottut.get.entity.Student;
import com.springboottut.get.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentService service;

    @PostMapping("/addStudent")
    public Student postStudent(@RequestBody Student s){
        return service.addStudent(s);
    }

    @PostMapping("/addStudents")
    public List<Student> postStudents(@RequestBody List<Student> students){
        return service.addStudents(students);
    }

    @GetMapping("/fetchStudents")
    public List<Student> getStudents(){
        return service.fetchAll();
    }
}
