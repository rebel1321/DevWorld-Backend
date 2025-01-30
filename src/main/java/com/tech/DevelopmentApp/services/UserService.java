package com.tech.DevelopmentApp.services;

import com.tech.DevelopmentApp.Exception.UserException;
import com.tech.DevelopmentApp.Model.User;

public interface UserService {
    public User findUserById(long userId) throws UserException;
    public User findUserprofileByJwt(String jwt) throws UserException;
}
