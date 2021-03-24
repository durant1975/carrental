package com.carrental.model;



import lombok.Data;

import javax.persistence.*;

@Data
@Entity( name="Body_type")
public class BodyType {

    @Id
    @Column(name="ID",unique =true, nullable=false)
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer BodyType_ID;
    @Column(name="BodyType",unique =true, nullable=false,length =30)
    private String BodyType;
}
