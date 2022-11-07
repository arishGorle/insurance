package com.insurance.profilesservice.services;

import com.insurance.profilesservice.exception.BadProfileException;
import com.insurance.profilesservice.model.User;

public interface UserService {

    boolean existsById(Long id) throws BadProfileException;
    User getById(Long id) throws BadProfileException;
    User add(User user) throws BadProfileException;

}
