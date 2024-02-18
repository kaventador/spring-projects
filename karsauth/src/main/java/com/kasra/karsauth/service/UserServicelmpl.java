package com.kasra.karsauth.service;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import com.kasra.karsauth.dto.UserRegistrationDto;
import com.kasra.karsauth.entity.Role;
import com.kasra.karsauth.entity.User;
import com.kasra.karsauth.repository.Userrepository;
@Service
class UserServiceImpl implements UserService {
    @Autowired
    private Userrepository userRepo;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepo.findByEmail(username);
        if (user == null){
            throw new UsernameNotFoundException("Invalid username or password.");
        }
        return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(), mapRolesToAuthorities(user.getRoles()));
    }
    @Override
    public User save(UserRegistrationDto userRegDto) {
        User user = new User();
        user.setFirstName(userRegDto.getFirstName());
        user.setLastName(userRegDto.getLastName());
        user.setEmail(userRegDto.getEmail());
        user.setPassword(passwordEncoder.encode(userRegDto.getPassword()));
        List<Role> roles=new ArrayList<Role>();
        Role role=new Role();
        role.setName("ROLE_USER");
        roles.add(role);
        user.setRoles(roles);
        return userRepo.save(user);
    }
    private Collection < ? extends GrantedAuthority > mapRolesToAuthorities(Collection < Role > roles) {
        return roles.stream().map(role-> new SimpleGrantedAuthority(role.getName())).collect(Collectors.toList());
    }
}