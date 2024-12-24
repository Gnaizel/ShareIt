package org.example.dto;

import org.example.user.User;

public class UserMapper {

    public static UserDto toDto(User user) {
        return UserDto.builder()
                .id(user.getId())
                .login(user.getLogin())
                .build();
    }

    public static User toModel(UserDto user) {
        return User.builder()
                .id(user.getId())
                .login(user.getLogin())
                .build();
    }
}
