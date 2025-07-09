package mate.academy.service.impl;

import mate.academy.dao.AuthenticationDao;
import mate.academy.lib.Inject;
import mate.academy.lib.Service;
import mate.academy.model.User;

@Service
public class AuthenticationServiceImpl {

    @Inject
    private AuthenticationDao authenticationDao;

    User login(String email, String password) {

    }

    User register(String email, String password)
}
