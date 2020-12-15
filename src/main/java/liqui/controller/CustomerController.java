package liqui.controller;

import java.util.List;
import java.util.Optional;

import liqui.db.model.Customer;
import liqui.db.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/customers")
public class CustomerController {

    private final CustomerRepository repository;

    @GetMapping("/all")
    public List<Customer> getAllCustomers() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Customer> getCustomerById(@PathVariable final Integer id) {
        return repository.findById(id);
    }

    @PostMapping
    public Customer createCustomer(final Customer customer) {
        return repository.save(customer);
    }

    @DeleteMapping
    public void deleteCustomer(final Customer customer) {
        repository.delete(customer);
    }
}
