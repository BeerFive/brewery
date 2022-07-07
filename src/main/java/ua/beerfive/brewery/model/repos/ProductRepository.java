package ua.beerfive.brewery.model.repos;

import org.springframework.data.repository.CrudRepository;
import ua.beerfive.brewery.model.dto.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
