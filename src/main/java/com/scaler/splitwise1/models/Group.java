package com.scaler.splitwise1.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
public class Group extends Basemodel{
    private String name;
    private Date createdAt;
    private String description;

    @ManyToMany
    private List<User> admins ;
    @ManyToOne
    private User createdby;

    @ManyToMany
    private List<User> participants;

    @OneToMany
    private List<Expense> listofexpense;


}
