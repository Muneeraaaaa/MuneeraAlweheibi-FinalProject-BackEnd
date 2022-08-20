package com.example.finalprojectbackend.model;

import lombok.AllArgsConstructor;

import javax.persistence.Id;
import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

@AllArgsConstructor @Valid

public class Person {
    @NotEmpty
    private String FisrtName;
    @NotEmpty

    private String LasteName;
    @NotEmpty

    private String Password;
    @NotEmpty
    @Id
    private String username;
    @NotEmpty
    @Email
    private String Email;
}
