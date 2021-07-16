package com.devn8.app;

import com.devn8.app.model.User;
import com.devn8.app.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class Usercontroller {


        private final UserRepository userRepository;
        @Autowired
        public Usercontroller(UserRepository userRepository) {
            this.userRepository = userRepository;
        }

        @PostMapping
        public void insert(@RequestBody User user) {
        this.userRepository.insert(user);
    }

    }

