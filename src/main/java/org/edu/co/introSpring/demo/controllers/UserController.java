package org.edu.co.introSpring.demo.controllers;

import org.apache.coyote.BadRequestException;
import org.edu.co.introSpring.demo.domain.model.User;
import org.edu.co.introSpring.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value= "/users")
public class UserController {
  @Autowired
  private UserService userService;

   @GetMapping(value = "/get-users")
   public List<User> getAllUsers(){
       return userService.listUsers();
   }

   @DeleteMapping(value = "/delete-user/{id}")
    public void deleteUser(@PathVariable Long id){
       userService.removeUser(id);
   }

   @PostMapping(value = "/add-user")
   public void addUser(@RequestBody User user){
       userService.addUser(user);
   }

   @GetMapping(value = "/get-user/{id}")
   public User getUser(@PathVariable Long id){
       return userService.byId(id);
   }
}
