package com.robertoapi.login_and_authentication_api.service;
import com.robertoapi.login_and_authentication_api.model.TB_User;
import com.robertoapi.login_and_authentication_api.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }


    public void createUser(TB_User user){
        userRepository.save(user);
    }


    public List<TB_User> findAllUsers(){
        return userRepository.findAll();
    }


    public Optional<TB_User> findUserById(Long id){
        return userRepository.findById(id);
    }


    public void deleteUserById(Long id){
        userRepository.deleteById(id);
    }

}
