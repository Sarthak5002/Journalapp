package net.engineeringdigest.journalApp.service;

import net.engineeringdigest.journalApp.entity.User;
import net.engineeringdigest.journalApp.repository.UserRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void saveEntry(User user) {
        userRepository.save(user);
    }

    public List<User> getEntry() {
        return userRepository.findAll();
    }

    public Optional<User> findById(ObjectId myId) {
        return userRepository.findById(myId);
    }

    public void deleteById(ObjectId myId) {
        userRepository.deleteById(myId);

    }

    public User findByUserName(String userName) {
        return userRepository.findByUserName(userName);
    }

}
