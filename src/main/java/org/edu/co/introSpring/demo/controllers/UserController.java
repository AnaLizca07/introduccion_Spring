package org.edu.co.introSpring.demo.controllers;

import org.apache.coyote.BadRequestException;
import org.edu.co.introSpring.demo.domain.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value= "/users")
public class UserController {
   @GetMapping(value = "/get-user")
    public User getUser(){
       return User.builder()
              .id("1")
              .name("Juan")
              .age(25)
              .cellphone("3012345678")
              .email("juan@")
              .build();
   }

   @GetMapping(value = "/get-user-by-id/{id}")
    public User getUserById(@PathVariable String id) throws BadRequestException{
       if(id.equalsIgnoreCase("1")){
           return User.builder()
                  .id("1")
                  .name("Juan")
                  .age(25)
                  .cellphone("3012345678")
                  .email("juan@")
                  .build();
       }
       throw new BadRequestException("Ey ey, id inválido");
   }
}
