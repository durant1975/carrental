package com.carrental.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Color {
    @Id
    @Column(name="ID",unique =true, nullable=false)
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer Color_ID;
    private String Color;

}
