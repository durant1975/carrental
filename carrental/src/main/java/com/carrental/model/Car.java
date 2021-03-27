package com.carrental.model;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Entity
public class Car {
    @Id
    @Column(name="Car_ID",unique =true, nullable=false)
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer Car_ID;

    @ManyToOne
    @JoinColumn(name ="Branch_ID" )
    private Branch branches;

    @Column(name="Car_Code",unique =true, nullable=false,length =100)
    private Integer Car_Code;

    @ManyToOne
    @JoinColumn(name ="Brand_ID" )
    private Brand brand;

    @ManyToOne
    @JoinColumn(name ="Model_ID" )
    private Model model;

    @ManyToOne
    @JoinColumn(name ="BodyType_ID" )
    private BodyType bodyType;


    @ManyToOne
    @JoinColumn(name ="Color_ID" )
    private Color color;

    @Column(name="Year")
    private Integer Year;

    @Column(name="Per_date_rate")
    private Float Per_date_rate;

    @ManyToOne
    @JoinColumn(name ="Status_ID" )
    private CarStatus status;

    @OneToMany
    @JoinColumn (name= "Reservation_ID", referencedColumnName="Car_ID")
    List<Reservation> reservations = new ArrayList();



}
