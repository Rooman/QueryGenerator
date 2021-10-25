package com.luxoft.querygenerator.entity;

import com.luxoft.querygenerator.domain.Column;
import com.luxoft.querygenerator.domain.Entity;

// ORM
@Entity(table = "persons")
public class Person {
    @Column
    private int id;
    @Column(name = "person_name")
    private String name;
    @Column
    private double salary;
}
