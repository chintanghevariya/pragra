package co.pragra.pragracoffeetime.controller;

import co.pragra.pragracoffeetime.entity.Customer;
import co.pragra.pragracoffeetime.repo.CustomerRepository;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
public class CustomerController {

    private CustomerRepository repository;
    public CustomerController(CustomerRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/customer/create")
    public String getCreateCustomer(Model model){
        model.addAttribute("pageTitle", "Create A Customer | Pragra CoffeeTime");
        model.addAttribute("customer", new Customer());
        return "create-customer";
    }

    @PostMapping("/customer/create")
    public String create(@ModelAttribute Customer customer, Model model){
        repository.save(customer);
        model.addAttribute("customers", repository.findAll());
        return "customer";
    }

    @GetMapping("/customer/all")
    public String getAllCustomers(Model model){
        model.addAttribute("customers", repository.findAll());
        return "customer";
    }

    @PutMapping("/save")
    public String saveCustomer(@PathVariable int id, @ModelAttribute("customers") Customer customer) throws Exception {
        Customer updateCustomer = repository.findById(id)
                .orElseThrow(() -> new Exception("Employee not exist with id: " + id));
        updateCustomer.setFirstName(customer.getFirstName());
        updateCustomer.setLastName(customer.getLastName());
        updateCustomer.setPhone(customer.getPhone());
        repository.save(updateCustomer);
        return "customer";
    }

    @GetMapping("/customer/showFormForUpdate/{id}")
    public String showFormForUpdate(@PathVariable(value = "id") int id, Model model) {
        Optional<Customer> customer = repository.findById(id);
        model.addAttribute("customers", customer);
        return "updateForm";
    }

//    @GetMapping("/customer/delete/id")
//    public String deleteCustomer(@PathVariable("id") int id){
//        repository.deleteById(id);
//        return "customer";
//    }
    @RequestMapping(value = "/customer/delete/{id}", method = RequestMethod.DELETE)
    public String deleteCustomer(@PathVariable int id, Model model) {
        Optional<Customer> customerToDelete = repository.findById(id);
        if (customerToDelete.isPresent()) {
            repository.deleteById(id);
        }
        model.addAttribute("customers", repository.findAll());
        return "customer";
    }

}
