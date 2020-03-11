package com.ace.hotel.service;

import com.ace.hotel.model.User;

public interface UserService {
    User login(String username, String password);

    int register(User user);

    int updateUser(User user);

    boolean checkPhoneExists(String phone);

    boolean checkIdCardExists(String idCard);

    boolean checkEmailExists(String email);
}
