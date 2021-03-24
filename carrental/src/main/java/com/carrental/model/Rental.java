package com.carrental.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Rental {
    @Id
    @Column(name="ID",unique =true, nullable=false)
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer Company_ID;
    private String CompanyName;
    private String Address;
    private String Owner;
    private String Web;
    private String Email;
    private String Phone;
}
