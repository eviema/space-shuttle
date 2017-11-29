package au.com.jiangren.spaceshuttle.repository;

import au.com.jiangren.spaceshuttle.model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CustomerRepository extends MongoRepository<Customer, String> {

    Customer findByFirstName(String firstName);

    List<Customer> findByLastName(String lastName);

    List<Customer> findByLastNameStartsWithIgnoreCase(String lastName);
}
