package com.meetup.service;

import com.meetup.domain.User;

public interface UserService {
    Iterable<User> getAll();

    User save(User user);

    User findOne(Long id);
}
