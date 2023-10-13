package com.scaler.splitwise1.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Entity
public class Expensepayinguser extends Basemodel {

    @ManyToOne
    private  User user;

    @ManyToOne
    private Expense expense;

    private double amount;


}
