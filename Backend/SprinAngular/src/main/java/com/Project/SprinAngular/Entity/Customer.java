package com.Project.SprinAngular.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "customer")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Customer {
    @Column(name = "customerId", length = 50)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int customerId;

    @Column(name = "customerName", length = 50)
    private String customerName;

    @Column(name = "customerAddress", length = 60)
    private String customerAddress;

    @Column(name = "mobileNo", length = 50)
    private int mobileNo;
}
