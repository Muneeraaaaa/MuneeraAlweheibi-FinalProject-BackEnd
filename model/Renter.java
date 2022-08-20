package com.example.finalprojectbackend.model;

import lombok.AllArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.Valid;

@AllArgsConstructor @Valid
@Entity
public class Renter {
    @Id
    private String Payment;
}
