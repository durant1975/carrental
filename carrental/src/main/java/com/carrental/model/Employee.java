package com.carrental.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Employee {
    @Id
    @Column(name="ID",unique =true, nullable=false)
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer Employee_ID;
    private String Branch_ID;
    private String First_Name;
    private String Surname;
    private String Position;

}
