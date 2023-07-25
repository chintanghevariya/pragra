package co.pragra.pragracoffeetime.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "TABLE_CUSTOMER")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name= "CUSTOMER_ID")
    private Integer id;
    @Column(nullable = false)
    private String firstName;
    @Column
    private String lastName;
    @Column
    private String phone;



}
