package com.sujith.bms.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

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