package com.octodb.springsecurity.service;

import com.octodb.springsecurity.domain.Role;
import com.octodb.springsecurity.domain.User;
import com.octodb.springsecurity.repository.RoleRepository;
import com.octodb.springsecurity.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

//Transactional para assegurar que se faca rolback das transacoes no caso de um erro
@Transactional
@Service
public class UserServiceImpl implements UserService{

    final private UserRepository userRepository;
    final private RoleRepository roleRepository;

    public UserServiceImpl(UserRepository userRepository, RoleRepository roleRepository) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
    }

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUser(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public Role saveRole(Role role) {
        return roleRepository.save(role);
    }

    @Override
    public void addRoleToUser(String username, String roleName) {
        User user = userRepository.findByUsername(username);
        Role role = roleRepository.findByName(roleName);
        user.getRoles().add(role);
    }
}
