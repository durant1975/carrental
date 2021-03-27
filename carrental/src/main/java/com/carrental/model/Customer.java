package com.carrental.model;


import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Data
@Entity
public class Customer {
    @Id
    @Column(name="Customer_ID",unique =true, nullable=false)
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer Customer_ID;
    private String User_Name;
    @Column(name="Password",unique =true, nullable=false,length =100)
    private String Password;
    @Column(name="Surname",unique =true, nullable=false,length =100)
    private String Surname;
    @Column(name="Email",unique =true, nullable=false,length =20)
    private String Email;
    @Column(name="Phone",unique =true, nullable=false,length =20)
    private String Phone;
    @Column(name="Address",unique =true, nullable=false,length =100)
    private String Address;

    @OneToMany(mappedBy="Customer")
    private Reservation reservation;
   /*  @JoinColumn (name= "Customer_ID", referencedColumnName="Customer_ID")
    List<Reservation> reservations = new ArrayList();,*/

}
