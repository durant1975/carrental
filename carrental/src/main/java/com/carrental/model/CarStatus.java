package com.carrental.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class CarStatus {
    @Id
    @Column(name="ID",unique =true, nullable=false)
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer Status_ID;
    private String Status;
}
