package co.pragra.pragracoffeetime.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity(name = "TABLE_ORDER")
@Data
public class Order{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private double purchaseAmount;
    private Date orderDate;

    @ManyToMany(targetEntity = Product.class, cascade = CascadeType.DETACH)
    @JoinTable(
            name = "table_order_products",
            joinColumns = @JoinColumn(name = "table_order_id"),
            inverseJoinColumns = @JoinColumn(name = "products_id")
    ) private List<Product> products;

    @ManyToOne(targetEntity = Customer.class)
    @JoinColumn(name = "customer_customer_id")
    private Customer customer;
}
