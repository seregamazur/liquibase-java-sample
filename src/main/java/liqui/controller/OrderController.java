package liqui.controller;

import java.util.List;
import java.util.Optional;

import liqui.db.model.Order;
import liqui.db.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/order")
public class OrderController {

    private final OrderRepository repository;

    @PostMapping
    public Order createOrder(final Order order) {
        return repository.save(order);
    }

    @GetMapping("/{id}")
    public Optional<Order> getProductById(@PathVariable final Integer id) {
        return repository.findById(id);
    }

    @GetMapping("/customer/{customerId}")
    public List<Order> getProductsByCustomerId(@PathVariable final Integer customerId) {
        return repository.findByCustomerId(customerId);
    }

}
