package ru.alexk.MyDbLr8.service;

import ru.alexk.MyDbLr8.dto.UserDto;
import ru.alexk.MyDbLr8.entity.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();
}
