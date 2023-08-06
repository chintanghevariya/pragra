package co.pragra.pragracoffeetime.rest;

import co.pragra.pragracoffeetime.entity.Customer;
import co.pragra.pragracoffeetime.entity.Product;
import co.pragra.pragracoffeetime.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class ProductApi {

    @Autowired
    private ProductService service;
    @GetMapping("/product")
    public List<Product> getAll(){
        return service.getAll();
    }

    @GetMapping("/product/{id}")
    public Optional<Product> getProductById(@PathVariable int id){
        return service.getProductById(id);
    }

    @PostMapping("/product")
    public Product create(@RequestBody Product product){
        return this.service.createProduct(product);
    }

    @PostMapping("/productAll")
    public List<Product> createAll(@RequestBody List<Product> productList){
        return this.service.createProductAll(productList);
    }

    @PutMapping("/product/{id}")
    public Product update(@RequestBody Product product){
        return this.service.updateProduct(product);
    }

    @DeleteMapping("/product/{id}")
    public Product delete(@PathVariable int id){
        return service.deleteProduct(id);
    }
}
