package com.project.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
@Entity
@Table(name="studentdata")
public class StudentModel{
    @Id
    @GeneratedValue
    int sno;
    String name;
    void setSno(int sn){
        this.sno=sn;
    }
    void setName(String n){
        this.name=n;
    }
    int getSno(){
        return sno;
    }
    String getName(){
        return name;
    }
}
