package com.example.employeeaddress.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long employeeId;

    private String firstName;

    private String lastName;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_address_addressId")
    private Address address;
}
