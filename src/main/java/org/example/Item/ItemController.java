package org.example.Item;

import lombok.RequiredArgsConstructor;
import org.example.dto.ItemDto;
import org.example.dto.ItemMapper;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.stream.Collectors;

@RestController("/items")
@RequiredArgsConstructor
public class ItemController {
    private ItemRepository itemRepository;

    @GetMapping
    public Collection<ItemDto> getAll() {
        return itemRepository.getAll().stream()
                .map(ItemMapper::toDto)
                .collect(Collectors.toSet());
    }

    @GetMapping("/{id}")
    public ItemDto getById(@PathVariable("id") long id) {
        return ItemMapper.toDto(itemRepository.getById(id));
    }

    @PostMapping
    public ItemDto save(Item item) {
        return ItemMapper.toDto(itemRepository.save(item));
    }

    @PutMapping
    public ItemDto update(Item item) {
        return ItemMapper.toDto(itemRepository.update(item));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") long id) {
        itemRepository.delete(id);
    }
}
