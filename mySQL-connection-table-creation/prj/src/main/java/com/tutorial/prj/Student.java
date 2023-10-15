package com.tutorial.prj;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "STUDENT")
public class Student {
    @Id
    @Column(name = "ID")
    private int id;
    @Column(name = "MARKS")
    private int marks;
    @Column(name = "NAME")
    private String name;

}
