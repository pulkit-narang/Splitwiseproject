package com.scaler.splitwise1.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "users")
public class User extends Basemodel{

    private String userName;
    private String phnNumber;
    private String hashedpassword;



}
