package liqui.controller;

import java.util.List;
import java.util.Optional;

import liqui.db.model.Product;
import liqui.db.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/products")
public class ProductController {

    private final ProductRepository repository;

    @GetMapping("/all")
    public List<Product> getAllProducts() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Product> getProductById(@PathVariable final Integer id) {
        return repository.findById(id);
    }

}
