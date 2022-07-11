package me.tomaszterlecki.storeapp.services;

import me.tomaszterlecki.storeapp.database.UserDatabase;
import me.tomaszterlecki.storeapp.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class UserAuthentication {
    @Autowired
    private UserDatabase userDatabase;

    public boolean authenticate(String login, String password){
        Optional<User> userFromDataBase = userDatabase.getUserByLogin(login);
        if(userFromDataBase.isPresent()&&userFromDataBase.get().getPassword().equals(password)){
            return true;
        }
        return false;
    }
}
