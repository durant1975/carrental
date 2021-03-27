package com.carrental.model;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Rental {
    @Id
    @Column(name="Company_ID",unique =true, nullable=false)
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer Company_ID;
    @Column(name="CompanyName",unique =true, nullable=false,length =200)
    private String CompanyName;
    @Column(name="Address",unique =true, nullable=false,length =100)
    private String Address;
    @Column(name="Owner",unique =true, nullable=false,length =100)
    private String Owner;
    @Column(name="Web",unique =true, nullable=false,length =100)
    private String Web;
    @Column(name="Email",unique =true, nullable=false,length =100)
    private String Email;
    @Column(name="Phone",unique =true, nullable=false,length =20)
    private String Phone;
    @OneToMany
    @JoinColumn (name= "Company_ID", referencedColumnName="Company_ID")
    List<Branch> branches= new  ArrayList();


}
