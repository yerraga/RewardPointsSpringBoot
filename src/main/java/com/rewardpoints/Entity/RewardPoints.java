package com.rewardpoints.Entity;


import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
@Table(name = "Reward Points")
public class RewardPoints {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String customerId;
    private String firstName;
    private String lastName;
    private double amount;
    private LocalDate date;

}

