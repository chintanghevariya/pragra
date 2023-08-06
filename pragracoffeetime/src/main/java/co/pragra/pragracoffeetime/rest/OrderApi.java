package co.pragra.pragracoffeetime.rest;

import co.pragra.pragracoffeetime.entity.Order;
import co.pragra.pragracoffeetime.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class OrderApi {
    private final OrderService service;
    @GetMapping("/order")
    public List<Order> getAll(){
        return service.getAll();
    }

    @GetMapping("/order/{id}")
    public Optional<Order> getOrder(@PathVariable int id){
        return service.getById(id);
    }

    @PostMapping("/order")
    public Order createOrder(@RequestBody Order order){
        return this.service.createOrder(order);
    }

    @PutMapping("/order/{id}")
    public Order update(@RequestBody Order order){
        return this.service.updateOrder(order);
    }

    @DeleteMapping("/order/{id}")
    public Order delete(@PathVariable int id){
        return service.deleteOrder(id);
    }

}
