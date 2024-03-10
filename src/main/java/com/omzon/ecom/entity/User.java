package com.omzon.ecom.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "user")

public class User {

    int id;
    String name;
    String userName;
    String email;
    String password;
}
