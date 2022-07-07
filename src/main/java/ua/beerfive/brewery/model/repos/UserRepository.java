package ua.beerfive.brewery.model.repos;

import org.springframework.data.repository.CrudRepository;
import ua.beerfive.brewery.model.dto.Product;
import ua.beerfive.brewery.model.dto.User;

public interface UserRepository extends CrudRepository<User, Long> {
}
