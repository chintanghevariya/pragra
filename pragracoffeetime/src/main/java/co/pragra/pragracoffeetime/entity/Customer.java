package co.pragra.pragracoffeetime.entity;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.Value;

import javax.persistence.*;

@Entity
@Data
@Table(name = "TABLE_CUSTOMER")
@ApiModel(value="Customer")
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
