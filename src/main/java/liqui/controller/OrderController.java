package liqui.controller;

import java.util.List;

import liqui.db.model.Order;
import liqui.db.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<Order> createOrder(final Order order) {
        return ResponseEntity.ok(repository.save(order));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Order> getOrderById(@PathVariable final Integer id) {
        return ResponseEntity.ok(repository.findById(id).get());
    }

    @GetMapping("/customer/{customerId}")
    public ResponseEntity<List<Order>> getOrdersByCustomerId(@PathVariable final Integer customerId) {
        return ResponseEntity.ok(repository.findAllByCustomerId(customerId));
    }

}
