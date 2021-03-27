package com.carrental.model;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Employee {
    @Id
    @Column(name="Employee_ID",unique =true, nullable=false)
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer Employee_ID;

    @ManyToOne
    @JoinColumn( name ="Branch_ID" )
   private Branch branch;
    @Column(name="First_Name",unique =true, nullable=false,length =100)
    private String First_Name;
    @Column(name="Surname",unique =true, nullable=false,length =100)
    private String Surname;
    @Column(name="Position",unique =true, nullable=false,length =20)
    private String Position;

}
