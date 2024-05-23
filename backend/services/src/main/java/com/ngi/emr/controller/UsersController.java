package com.ngi.emr.controller;

import com.ngi.emr.contract.UserContract;
import com.ngi.emr.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UsersController {
    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public List<UserContract> getUsers(){
        return userService.getUsers();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void addUser(@RequestBody UserContract user){
        userService.addUser(user);
    }

    @RequestMapping(method = RequestMethod.DELETE, value="/{id}")
    public void removeUser(@PathVariable("id") int id){
        userService.removeUser(id);
    }

    @RequestMapping(method = RequestMethod.PUT, value="/{id}")
    public void updateUser(@PathVariable("id") int id, @RequestBody UserContract user){
        userService.updateUser(id, user);
    }
}
