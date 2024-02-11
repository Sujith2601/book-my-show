package com.sujith.bms.models;

import lombok.Getter;
import lombok.Setter;


import java.util.List;

import jakarta.persistence.Entity;

@Entity //Annotations.
@Getter
@Setter
public class Actor extends BaseModel {
    private String name;

    private int age;
}


// private attributes in a class.

//Lombok

//Spring Data JPA.