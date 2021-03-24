package com.carrental.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Model {
    @Id
    @Column(name="ID",unique =true, nullable=false)
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer Model_ID;
    private String Status;
}
