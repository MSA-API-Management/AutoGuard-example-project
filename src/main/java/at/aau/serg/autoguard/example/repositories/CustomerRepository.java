package at.aau.serg.autoguard.example.repositories;

import at.aau.serg.autoguard.example.models.Customer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class CustomerRepository {
    private final List<Customer> customers = new ArrayList<>();
    private final AtomicLong idCounter = new AtomicLong();

    // Save a new customer
    public Customer save(Customer customer) {
        if (customer.getId() == null) {
            customer.setId(idCounter.incrementAndGet());
        }
        customers.add(customer);
        return customer;
    }

    // Find customer by ID
    public Optional<Customer> findById(Long id) {
        return customers.stream().filter(customer -> customer.getId().equals(id)).findFirst();
    }

    // Find all customers
    public List<Customer> findAll() {
        return new ArrayList<>(customers);
    }

    // Update customer by ID
    public Optional<Customer> update(Long id, Customer newCustomer) {
        return findById(id).map(customer -> {
            customer.setName(newCustomer.getName());
            customer.setEmail(newCustomer.getEmail());
            return customer;
        });
    }

    // Delete customer by ID
    public boolean deleteById(Long id) {
        return customers.removeIf(customer -> customer.getId().equals(id));
    }
}
