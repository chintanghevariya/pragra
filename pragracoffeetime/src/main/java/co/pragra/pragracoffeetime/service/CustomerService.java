package co.pragra.pragracoffeetime.service;

import co.pragra.pragracoffeetime.entity.Customer;
import co.pragra.pragracoffeetime.execption.InvalidCustomerException;
import co.pragra.pragracoffeetime.execption.InvalidDeleteException;
import co.pragra.pragracoffeetime.execption.InvalidUpdateException;
import co.pragra.pragracoffeetime.repo.CustomerRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class CustomerService {
    private final CustomerRepository repository;
    public Customer createCustomer(Customer customer){
        if( customer.getFirstName() == null || customer.getFirstName().isEmpty()){
            throw new InvalidCustomerException("Customer first name can't null or blank.");
        }
        return this.repository.save(customer);
    }

    public List<Customer> createCustomerAll(List<Customer> customer){
        return this.repository.saveAll(customer);
    }

    public Customer updateCustomer(Customer customer){
        if(customer.getId() == null || customer.getId()<=0){
            throw new InvalidUpdateException("Invalid Cusotmer ID");
        }
        Optional<Customer> optionalCustomer = repository.findById(customer.getId());
        Customer cust = optionalCustomer.orElseThrow(() -> new InvalidUpdateException("Invalid Cusotmer ID"));

        if( customer.getFirstName() == null || customer.getFirstName().isEmpty()){
            throw new InvalidUpdateException("Customer not found");
        }
        return this.repository.save(customer);
    }

    public Customer deleteCustomer(int id){
        if(id <= 0 || !repository.findById(id).isPresent()){
            throw new InvalidDeleteException("Invalid Customer ID");
        }
        Optional<Customer> deleteEntity = this.repository.findById(id);
        Customer cust = deleteEntity.orElseThrow(() -> new InvalidDeleteException("Invalid Delete"));
        this.repository.deleteById(id);

        return cust;
    }

    public List<Customer> getAll(Optional<String> lastName){
        if(lastName.isPresent()){
            return this.repository.findAllByLastName(lastName.get());
        }
        return this.repository.findAll();
    }

    public Optional<Customer> getById(int id){
        return this.repository.findById(id);
    }
}
