package com.scaler.splitwise1.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Currency extends Basemodel {
    private String name;
}
