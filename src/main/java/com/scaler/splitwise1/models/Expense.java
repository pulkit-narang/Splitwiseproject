package com.scaler.splitwise1.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Expense extends Basemodel{
    private Double amount;
    private String description;
    @ManyToOne
    private User createdby;

    @ManyToOne
    private Currency currency;

    @ManyToMany
    private List<User> participants;



}
