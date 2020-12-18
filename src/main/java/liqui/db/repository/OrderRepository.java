package liqui.db.repository;

import java.util.List;

import liqui.db.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {

    List<Order> findAllByCustomerId(final Integer customerId);
}
