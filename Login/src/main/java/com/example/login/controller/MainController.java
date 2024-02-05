package com.example.login.controller;

import com.google.gson.Gson;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MainController {

    @RequestMapping("/json")
    public String json(){
        List<User> users = new ArrayList<>();
        User user = new User("kasra","123456");
        User user1 = new User("reza","kavakebi");
        users.add(user);
        users.add(user1);
        return new Gson().toJson(users);
    }


//    @RequestMapping(value = {"/path/{username}/{password}","/path/{password}"},method = RequestMethod.POST)
//    public String path(@PathVariable(value = "username",required = false) String username,@PathVariable(value = "password") String password){
//        return "Hello "+username+"\npass is "+ password;
//    }
//
//    @RequestMapping(value = "/param")
//    public String param(@RequestParam(value = "username") String username,@RequestParam(value = "password") String password){
//        return "Hello "+username+"\npass is "+ password;
//
//    }


    @RequestMapping(value = "/body")
    public String body(@RequestBody User body){
        return body.getUsername() +" , "+ body.getPassword();
    }


//
//    @RequestMapping(value = "/" , method = RequestMethod.GET)
//    public String firstRest() {
//        return "first rest";
//    }
//
//    @RequestMapping(value = "/second" , method = RequestMethod.GET)
//    public String secondRest() {
//        return "second rest";
//    }

//    @PostMapping(value = "/post")
//    public String postRest() {
//        return "Post Mapping";
//    }
//
//    @GetMapping(value = "/get")
//    public String getMapping(){
//        return "Get Mapping";
//    }

}
