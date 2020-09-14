package com.ricky.userservice.service.impl;

import com.ricky.userservice.domain.User;
import com.ricky.userservice.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    private List<User> userList;
    @Override
    public void create(User user) {
        userList.add(user);
    }

    @PostConstruct
    public void initData(){
        userList = new ArrayList<>();
        userList.add(new User(1L,"ricky","123456"));
        userList.add(new User(2L,"ricky1","123456"));
        userList.add(new User(3L,"ricky2","123456"));
    }

    @Override
    public User getUser(Long id) {
        List<User> findUserList = userList.stream().filter(userItem -> userItem.getId().equals(id)).collect(Collectors.toList());
        if (!CollectionUtils.isEmpty(findUserList)) {
            return findUserList.get(0);
        }
        return null;
    }
}
