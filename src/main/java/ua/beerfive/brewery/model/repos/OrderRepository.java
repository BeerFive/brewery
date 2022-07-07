package ua.beerfive.brewery.model.repos;

import org.springframework.data.repository.CrudRepository;
import ua.beerfive.brewery.model.dto.Order;
import ua.beerfive.brewery.model.dto.Product;

public interface OrderRepository extends CrudRepository<Order, Long> {
}
