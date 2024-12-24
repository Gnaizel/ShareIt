package org.example.Item;

import java.util.Collection;

public interface ItemRepository {

    Collection<Item> getAll();

    Item save(Item item);

    Item update(Item item);

    boolean delete(long id);

    Item getById(long id);
}
