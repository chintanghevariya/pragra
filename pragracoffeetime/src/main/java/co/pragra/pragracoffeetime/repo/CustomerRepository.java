package co.pragra.pragracoffeetime.repo;

import co.pragra.pragracoffeetime.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    //@Query("SELECT c FROM Customer c WHERE upper(c.lastName) = upper(:lastName)")
    @Query("SELECT c FROM Customer c WHERE upper(c.lastName) = upper(:lastName)")
    List<Customer> findAllByLastName(@Param("lastName") String lastName);
}
