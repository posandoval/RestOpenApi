package com.openapi.open.service;

import com.openapi.open.entity.User;
import com.openapi.open.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

 @Autowired
 private UserRepository userRepository;


    @Override
    public Optional<User> findById(Integer id) {
        Optional<User> userOptional=userRepository.findById(id);
        return userOptional;
    }

    @Override
 public List<User> findByName(String name) {
  List<User> temp=userRepository.findByName(name);
   return temp;
 }

 public List<User> findByContact(String con){
   List<User> contemp=userRepository.findByContact(con);
   return contemp;
 }

}