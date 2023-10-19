package com.postdata.prj.service;

import com.postdata.prj.entity.Student;
import com.postdata.prj.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepo;

    public Student addStudent(Student s){
        return studentRepo.save(s);
    }
}
