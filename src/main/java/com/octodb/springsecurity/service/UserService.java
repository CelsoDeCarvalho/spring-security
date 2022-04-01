package com.octodb.springsecurity.service;

import com.octodb.springsecurity.domain.Role;
import com.octodb.springsecurity.domain.User;

import java.util.List;

public interface UserService {

    User saveUser(User user);
    List<User> getUsers();
    User getUser(String username);
    Role saveRole(Role role);
    void addRoleToUser(String username, String roleName);
}
