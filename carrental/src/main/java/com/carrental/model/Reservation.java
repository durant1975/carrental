package com.carrental.model;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Entity

public class Reservation {
    @Id
    @Column(name="Reservation_ID",unique =true, nullable=false)
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer Reservation_ID;
    // @Column(name="Customer_ID")
    private Integer Car_ID;


    @ManyToOne
    @JoinColumn( name ="Branch_ID" )
    private Branch branch;

    @ManyToOne
    @JoinColumn(name ="Status_ID" )
    private ReservationStatus reservationstatus;

    @Column(name="Booking_Date")
    private Date Booking_Date;
    @Column(name="Date_From")
    private Date Date_From;
    @Column(name="Date_To")
    private Date Date_To;
    @Column(name="TotalCost",unique =true, nullable=false,length =100)
    private Float TotalCost;

}
