package ir.academy.blog.modules.users.service;

import ir.academy.blog.modules.users.model.Users;
import ir.academy.blog.modules.users.repository.UsersRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersService {

    private UsersRepository usersRepository;
    @Autowired
    public UsersService(UsersRepository usersRepository){
        this.usersRepository = usersRepository;
    }

    public Users registerUser(Users users){
        return this.usersRepository.save(users);
    }


    public List<Users> findAllUsers(){
        return this.usersRepository.findAll();
    }


}
