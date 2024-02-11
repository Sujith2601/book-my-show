package com.sujith.bms.models;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "users") 
public class User extends BaseModel {
    private String email;
}