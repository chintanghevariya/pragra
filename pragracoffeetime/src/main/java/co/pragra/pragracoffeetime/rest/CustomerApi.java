package co.pragra.pragracoffeetime.rest;

import co.pragra.pragracoffeetime.dto.ErrorDto;
import co.pragra.pragracoffeetime.entity.Customer;
import co.pragra.pragracoffeetime.execption.CustomerNotFoundException;
import co.pragra.pragracoffeetime.execption.InvalidCustomerException;
import co.pragra.pragracoffeetime.service.CustomerService;
import io.swagger.annotations.*;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.Instant;
import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
@Api(tags = "customer")
@ApiModel
public class CustomerApi {
    private final CustomerService service;
    @GetMapping("/customer")
    public List<Customer> getAll(
            @RequestParam(value = "lastName", required = false) String lastName,
            @RequestHeader(value = "X_SUPPLIER", required = false) String supplier
    ){
        return service.getAll(Optional.ofNullable(lastName));
    }

    @ApiParam(name="ID", example= "123")
    @ApiResponses(
            {
                    @ApiResponse(code = 200 , message = "Return the customer", response = Customer.class),
                    @ApiResponse(code = 400 , message = "Invalid ID data", response = ErrorDto.class),
                    @ApiResponse(code = 404 , message = "Customer Not Found", response = ErrorDto.class),
            }
    )
    @GetMapping(value = "/customer/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getCustomer(@PathVariable int id){
        if(id<0){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(
                    ErrorDto.builder().message("ID can't be negative")
                            .applicationId("APP1")
                            .statusCode(HttpStatus.BAD_REQUEST.value())
                            .timestamp(Instant.now()).build()
            );
        }

        try{
            Customer customer = service.getById(id).orElseThrow(()-> new CustomerNotFoundException("Can't find resourse you looking for"));
            return ResponseEntity.status(200).body(customer);
        }catch (CustomerNotFoundException exception){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(
                    ErrorDto.builder().message(exception.getMessage())
                            .applicationId("APP1")
                            .statusCode(HttpStatus.BAD_REQUEST.value())
                            .timestamp(Instant.now()).build()
            );
        }
    }

    @PostMapping("/customer")
    public ResponseEntity<?> create(@RequestBody Customer customer){
        if(customer.getFirstName() == null || customer.getLastName() == null){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(
                    ErrorDto.builder().message("firstName or lastName can't be null")
                            .applicationId("APP1")
                            .statusCode(HttpStatus.BAD_REQUEST.value())
                            .timestamp(Instant.now()).build()
            );
        }
        if(customer.getPhone() == null){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(
                    ErrorDto.builder().message("phone number can't be null")
                            .applicationId("APP1")
                            .statusCode(HttpStatus.BAD_REQUEST.value())
                            .timestamp(Instant.now()).build()
            );
        }

        return null; //this.service.createCustomer(customer);
    }

    @PostMapping("/customerAll")
    public List<Customer> createAll(@RequestBody List<Customer> customer){
        return this.service.createCustomerAll(customer);
    }

    @PutMapping("/customer/{id}")
    public Customer update(@RequestBody Customer customer){
        return this.service.updateCustomer(customer);
    }

    @DeleteMapping("/customer/{id}")
    public Customer delete(@PathVariable int id){
        return service.deleteCustomer(id);
    }

}
