package com.carrental.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity( name="brand")
public class Brand {

    @Id
    @Column(name="ID",unique =true, nullable=false)
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer Brand_ID;
    private String Brand;



}
