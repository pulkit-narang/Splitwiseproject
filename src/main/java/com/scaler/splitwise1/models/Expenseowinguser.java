package com.scaler.splitwise1.models;

import jakarta.persistence.ManyToOne;

import java.util.List;

public class Expenseowinguser extends  Basemodel {


    @ManyToOne
    private User users;

    @ManyToOne
    private Expense expense;

    private double amount;

}
