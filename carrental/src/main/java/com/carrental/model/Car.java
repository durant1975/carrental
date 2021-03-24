package com.carrental.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
public class Car {
    @Id
    @Column(name="ID",unique =true, nullable=false)
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer Car_ID;
    private Integer Branch_ID;
    private Integer Car_Code;
    private Integer Brand_ID;
    private Integer Model_ID;
    private Integer BodyType_ID;
    private Integer Color_ID;
    private Integer Year;
    private Float Per_date_rate;
    private Integer Status_ID;



}
