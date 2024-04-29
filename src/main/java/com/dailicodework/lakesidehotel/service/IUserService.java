package com.dailicodework.lakesidehotel.service;

import com.dailicodework.lakesidehotel.model.User;

import java.util.List;

public interface IUserService {
    User registerUser(User user);
    List<User> getUsers();

    void deleteUser(String email);

    User getUser(String email);
}
