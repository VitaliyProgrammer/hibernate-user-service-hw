package mate.academy.service.impl;

import java.util.Optional;
import mate.academy.dao.UserDao;
import mate.academy.lib.Service;
import mate.academy.model.User;
import mate.academy.service.UserService;
import mate.academy.util.HashUtil;

@Service
public class UserServiceImpl implements UserService {
    private final UserDao userDao;

    public UserServiceImpl(mate.academy.dao.UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public User add(User service) {
        String salt = HashUtil.generateSalt();
        return null;
    }

    @Override
    public Optional<User> findByEmail(String email) {
        return java.util.Optional.empty();
    }
}
