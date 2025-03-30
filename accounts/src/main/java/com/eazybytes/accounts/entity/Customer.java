package com.eazybytes.accounts.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Customer extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY,generator = "native")
    @GenericGenerator(name = "native",strategy = "native")
    private Long customerId;

    private String name;

    private String email;

    private String mobileNumber;

}
