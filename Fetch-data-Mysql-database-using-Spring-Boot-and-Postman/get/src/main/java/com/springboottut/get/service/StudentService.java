package com.springboottut.get.service;

import com.springboottut.get.entity.Student;
import com.springboottut.get.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepo;

    public Student addStudent(Student s){
        return studentRepo.save(s);
    }

    public List<Student> addStudents(List<Student> students){
        return studentRepo.saveAll(students);
    }

    public List<Student> fetchAll(){
        return studentRepo.findAll();
    }
}
