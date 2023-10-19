package com.postdata.prj.controller;

import com.postdata.prj.entity.Student;
import com.postdata.prj.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
    private StudentService service;

    @PostMapping("/addStudent")
    public Student postStudent(@RequestBody Student s){
        return service.addStudent(s);
    }
}
