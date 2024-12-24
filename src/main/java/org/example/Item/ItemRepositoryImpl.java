package org.example.Item;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashSet;
import java.util.UUID;

@Repository
public class ItemRepositoryImpl implements ItemRepository {
    private final Collection<Item> items = new HashSet<>();

    @Override
    public Collection<Item> getAll() {
        return items;
    }

    @Override
    public Item save(Item item) {
        item.setId(UUID.randomUUID().getMostSignificantBits() & Long.MAX_VALUE);
        items.add(item);
        return getById(item.getId());
    }

    @Override
    public Item update(Item item) {
        delete(item.getId());
        items.add(item);
        return getById(item.getId());
    }

    @Override
    public boolean delete(long id) {
        return items.removeIf(item -> item.getId() == id);
    }

    @Override
    public Item getById(long id) {
        return items.stream()
                .filter(item -> item.getId() == id)
                .findFirst()
                .orElseThrow();
    }
}
