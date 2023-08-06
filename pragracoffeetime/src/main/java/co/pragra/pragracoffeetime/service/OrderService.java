package co.pragra.pragracoffeetime.service;
import co.pragra.pragracoffeetime.entity.Order;
import co.pragra.pragracoffeetime.execption.*;
import co.pragra.pragracoffeetime.repo.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final OrderRepository repository;
    public Order createOrder(Order order){
//        if( order.getId() == null || order.getCustomer().getId() == null){
//            throw new InvalidCustomerException("Customer Id can't be null or order id can't be null");
//        }
        return this.repository.save(order);
    }

    public List<Order> getAll(){
        return this.repository.findAll();
    }

    public Optional<Order> getById(int id){
        return this.repository.findById(id);
    }

    public Order deleteOrder(int id){
        if(id <= 0 || !repository.findById(id).isPresent()){
            throw new InvalidOrderDeleteException("Invalid Order ID");
        }
        Optional<Order> deleteEntity = this.repository.findById(id);
        Order order = deleteEntity.orElseThrow(() -> new InvalidOrderDeleteException("Invalid Delete operation"));
        this.repository.deleteById(id);
        return order;
    }

    public Order updateOrder(Order order){
        if(order.getId() == null || order.getId()<=0){
            throw new InvalidUpdateException("Invalid Cusotmer ID");
        }
        Optional<Order> optional = repository.findById(order.getId());
        Order order1 = optional.orElseThrow(() -> new InvalidUpdateException("Invalid Cusotmer ID"));

        if( order.getCustomer().getId() == null || order.getId() == null){
            throw new InvalidUpdateException("Update : Order Id can't be null or customer id can't be null");
        } else if (order.getOrderDate() == null) {
            throw new InvalidUpdateException("Update : Order Date can't be null");
        }
        return this.repository.save(order);
    }
}
