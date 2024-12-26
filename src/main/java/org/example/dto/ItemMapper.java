package org.example.dto;

import org.example.Item.Item;

public class ItemMapper {

    public static ItemDto toDto(Item item) {
        return ItemDto.builder()
                .ownerId(item.getOwnerId())
                .id(item.getId())
                .beenOnLoan(item.getBeenOnLoan())
                .name(item.getName())
                .description(item.getDescription())
                .available(item.getAvailable())
                .build();
    }

    public static Item fromDto(ItemDto itemDto) {
        return Item.builder()
                .beenOnLoan(itemDto.getBeenOnLoan())
                .name(itemDto.getName())
                .description(itemDto.getDescription())
                .available(itemDto.getAvailable())
                .build();
    }
}
