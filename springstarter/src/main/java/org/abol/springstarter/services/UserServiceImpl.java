package org.abol.springstarter.services;

import org.abol.springstarter.models.BaseUser;
import org.abol.springstarter.repositories.BaseUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jakarta.transaction.Transactional;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private BaseUserRepository userRepository;

    @Override
    @Transactional
    public void saveUser(BaseUser user) {
        userRepository.save(user);
    }

    @Override
    public List<BaseUser> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public BaseUser getUserById(int id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void deleteUser(int id) {
        BaseUser user = userRepository.findById(id).orElse(null);
        if (user != null) {
            userRepository.delete(user);
        }
    }

    @Override
    public BaseUser findByEmail(String email) {
        return userRepository.findByEmail(email);
    }
}
