package me.tomaszterlecki.storeapp.database;

import me.tomaszterlecki.storeapp.model.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class UserDatabase {
    private List<User> users = new ArrayList<>();

    public UserDatabase(){
        users.add(new User("Wojciech", "admin", "admin"));
        users.add(new User("Janusz","janusz", "janusz"));
    }

    public List<User> getUsers() {
        return users;
    }
    public Optional<User> getUserByLogin(String login){
        for(User user: users){
            if(user.getLogin().equals(login)){
                return Optional.of(user);
            }
        }
        return Optional.empty();
    }
    public boolean isLoginExist(String login) {
        return getUserByLogin(login).isPresent();
    }
}
