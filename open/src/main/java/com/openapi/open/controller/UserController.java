package com.openapi.open.controller;

import com.openapi.open.entity.User;
import com.openapi.open.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1")
public class UserController {

    private UserService userService;

    //Constructor de UserControler o utilizar la anotacion @RequieredArgsContructor
    public UserController(UserService userService){
        this.userService=userService;
    }

    //Peticiones REST
    @GetMapping(value="testRest")
    public String testRest(){
        return "TestResrtAPI";
    }


    @GetMapping(value = "findById/{id}")
    public ResponseEntity<User> findById(@PathVariable Integer id){
        Optional<User> userOptional=userService.findById(id);
        return ResponseEntity.ok(userOptional.get());
    }
    @GetMapping(value="findByName/{name}")
    public ResponseEntity<List<User>> findByName(@PathVariable String name){
        List<User> userTemp=userService.findByName(name);
        return ResponseEntity.ok(userTemp);

    }

    @GetMapping(value="findByContact/{contact}")
    public ResponseEntity<List<User>> findByContact(@PathVariable String contact){
        List<User> users=userService.findByContact(contact);
        return ResponseEntity.ok(users);
    }


}
