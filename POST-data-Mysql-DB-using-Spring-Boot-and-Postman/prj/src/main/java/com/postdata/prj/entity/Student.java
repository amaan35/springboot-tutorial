package com.postdata.prj.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "students")
public class Student {
    @Id
    @Column(name = "id")
    @GeneratedValue
    private int id;

    @Column(name = "marks")
    private int marks;

    @Column(name = "name")
    private String name;
}
