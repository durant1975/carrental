package com.carrental.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
@Data
@Entity

public class Reservation {
    @Id
    @Column(name="ID",unique =true, nullable=false)
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer Reservation_ID;
    private Integer Customer_ID;
    private Integer Car_ID;
    private Integer Branch_ID;
    private Date Booking_Date;
    private Date Date_From;
    private Date Date_To;
    private Float TotalCost;
    private Integer Status_ID;

}
