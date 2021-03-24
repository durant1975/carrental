package com.carrental.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
public class Payment {
    @Id
    @Column(name="ID",unique =true, nullable=false)
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer Payment_ID;
    private Integer Reservation_ID;
    private Date Payment_Date;
    private Float Amount;
}
