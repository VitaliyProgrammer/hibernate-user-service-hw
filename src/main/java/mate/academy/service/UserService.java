package mate.academy.service;

import java.util.Optional;
import mate.academy.model.User;

public interface UserService {
    User add(User service);

    Optional<User> findByEmail(String email);
}
