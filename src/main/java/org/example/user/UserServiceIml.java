package org.example.user;

import lombok.RequiredArgsConstructor;
import org.example.dto.UserMapper;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserServiceIml implements UserService {
    private UserRepository userRepository;

    @Override
    public Collection<User> getAll() {
        return userRepository.getAll();
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public User update(User user) {
        return userRepository.update(user);
    }

    @Override
    public void delete(long id) {
        boolean userIsDeleteOrNo = userRepository.delete(id);
        if (userIsDeleteOrNo) throw new RuntimeException("in correct user id: " + id);
    }

    @Override
    public User getById(long id) {
        return userRepository.getById(id);
    }
}
