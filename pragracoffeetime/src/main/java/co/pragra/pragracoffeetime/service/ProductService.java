package co.pragra.pragracoffeetime.service;

import co.pragra.pragracoffeetime.entity.Customer;
import co.pragra.pragracoffeetime.entity.Product;
import co.pragra.pragracoffeetime.execption.InvalidCustomerException;
import co.pragra.pragracoffeetime.execption.InvalidDeleteException;
import co.pragra.pragracoffeetime.execption.InvalidUpdateException;
import co.pragra.pragracoffeetime.repo.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository repository;
    public Product createProduct(Product product){
//        if(product.getName().isEmpty() || product.getCost() <= 0){
//            throw new InvalidCustomerException("Name or Cost can't be null");
//        }
        return repository.save(product);
    }

    public List<Product> createProductAll(List<Product> productList){
        return this.repository.saveAll(productList);
    }

    public List<Product> getAll(){
        return this.repository.findAll();
    }

    public Optional<Product> getProductById(int id){
        if(!repository.findById(id).isPresent())
            throw new InvalidCustomerException("Order ID does not exists.");
        return this.repository.findById(id);
    }

    public Product deleteProduct(int id){
        if(id <= 0 || !repository.findById(id).isPresent())
            throw new InvalidDeleteException("Invalid Product ID");

        Product deleteEntity = this.repository.findById(id)
                .orElseThrow(() -> new InvalidDeleteException("Invalid Delete exception"));

        this.repository.delete(deleteEntity);
        return deleteEntity;
    }

    public Product updateProduct(Product product){
        if(product.getId() == null || product.getId()<=0){
            throw new InvalidUpdateException("Invalid Customer ID");
        }
        Optional<Product> optionalProduct = repository.findById(product.getId());
        Product product1 = optionalProduct.orElseThrow(() -> new InvalidUpdateException("Invalid Product ID"));

        return this.repository.save(product);
    }
}
