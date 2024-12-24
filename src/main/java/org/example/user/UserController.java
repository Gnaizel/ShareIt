package org.example.user;

import lombok.RequiredArgsConstructor;
import org.example.dto.UserDto;
import org.example.dto.UserMapper;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.stream.Collectors;

@RestController("/users")
@RequiredArgsConstructor
public class UserController {
    UserService userService;

    @GetMapping
    public Collection<UserDto> getAll() {
        return userService.getAll().stream()
                .map(UserMapper::toDto)
                .collect(Collectors.toSet());
    }
    
    @GetMapping("/{id}")
    public UserDto getById(@PathVariable("id") long id) {
        return UserMapper.toDto(userService.getById(id));
    }

    @PostMapping
    public UserDto add(User user) {
        return UserMapper.toDto(userService.save(user));
    }

    @PutMapping
    public UserDto update(User user) {
        return UserMapper.toDto(userService.update(user));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") long id) {
        userService.delete(id);
    }

}
