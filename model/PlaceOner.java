package com.example.finalprojectbackend.model;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.Valid;

@AllArgsConstructor @Valid
@Entity
public class PlaceOner {

//    location: String
//+LocationSize: String
//-KindOfStorage: String
//-price: Integer
//-Duration:String
    @Id
    private String id;
    private String location;
    private String locationSize;
    private String TypeOfStorage;
    private Integer price;
    private String duration;


}
