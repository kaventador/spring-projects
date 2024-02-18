package ir.academy.blog.modules.users.controller;

import ir.academy.blog.modules.users.model.Users;
import ir.academy.blog.modules.users.service.UsersService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    private UsersService usersService;
    @Autowired
    public UserController(UsersService usersService){
        this.usersService = usersService;
    }
    @RequestMapping(value = {"/", ""} , method = RequestMethod.GET)
    public List<Users> getUsers(){
        return usersService.findAllUsers();
    }
    @RequestMapping(value = {"/", ""} ,method = RequestMethod.POST)
    public Users registerUser(@RequestBody Users users){
        return usersService.registerUser(users);
    }

}
