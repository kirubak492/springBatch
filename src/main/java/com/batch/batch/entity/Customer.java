package com.batch.batch.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "customer")
public class Customer {

    @Id
    @Column(name="sno")
    private int sno;

    @Column(name="id")
    private String Customer_Id;

    @Column(name="fname")
    private String First_Name;

    @Column(name="company")
    private String Company;

    @Column(name="Country")
    private String country;

    @Column(name="email")
    private String Email;


}
