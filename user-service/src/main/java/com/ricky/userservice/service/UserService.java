package com.ricky.userservice.service;

import com.ricky.userservice.domain.User;
import org.springframework.stereotype.Service;

public interface UserService {
    void create(User user);
    User getUser(Long id);
}
