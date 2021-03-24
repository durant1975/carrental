package com.carrental.model;


import lombok.Data;

import javax.persistence.*;


@Data
@Entity
public class Customer {
    @Id
    @Column(name="ID",unique =true, nullable=false)
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer Customer_ID;
    private String User_Name;
    @Column(name="Password",unique =true, nullable=false,length =20)
    private String Password;
    @Column(name="Surname",unique =true, nullable=false,length =40)
    private String Surname;
    private String Email;
    private String Phone;
    private String Address;
}
