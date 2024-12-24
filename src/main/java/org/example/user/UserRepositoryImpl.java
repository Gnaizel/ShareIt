package org.example.user;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashSet;
import java.util.UUID;

@Repository
public class UserRepositoryImpl implements UserRepository {
    private final Collection<User> users = new HashSet<>();

    @Override
    public Collection<User> getAll() {
        return users;
    }

    @Override
    public User save(User user) {
        user.setId(UUID.randomUUID().getMostSignificantBits() & Long.MAX_VALUE);
        users.add(user);
        return getById(user.getId());
    }

    @Override
    public User update(User user) {
        delete(user.getId());
        users.add(user);
        return getById(user.getId());
    }

    @Override
    public boolean delete(long id) {
        return users.removeIf(user -> user.getId() == id);
    }

    @Override
    public User getById(long id) {
        return users.stream()
                .filter(user -> user.getId() == id)
                .findFirst()
                .orElseThrow();
    }
}
