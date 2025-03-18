package edu.uth.jpa_demo.services;
import edu.uth.jpa_demo.models.User;
import edu.uth.jpa_demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public Optional<User> findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

}
