package com.example.DataJPA;

import com.example.DataJPA.Entity.User;
import com.example.DataJPA.Service.UserDAOService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserDaoServiceCommandLineRunner implements CommandLineRunner {
    private static final Logger log =
            LoggerFactory.getLogger(UserDaoServiceCommandLineRunner.class);

    @Autowired
    UserDAOService userDAOService;
    @Override
    public void run(String... args) throws Exception {
       User user = new User("jack","Admin");
       long insert = userDAOService.insert(user);
       log.info("new user has created "+user);
    }
}
