package liqui.controller;

import java.util.List;

import liqui.db.model.Customer;
import liqui.db.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<List<Customer>> getAllCustomers() {
        return ResponseEntity.ok(repository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Customer> getCustomerById(@PathVariable final Integer id) {
        return ResponseEntity.ok(repository.findById(id).get());
    }

    @PostMapping
    public ResponseEntity<Customer> createCustomer(final Customer customer) {
        return ResponseEntity.ok(repository.save(customer));
    }

    @DeleteMapping
    public ResponseEntity<?> deleteCustomer(final Customer customer) {
        repository.delete(customer);
        return ResponseEntity.ok().build();
    }
}
