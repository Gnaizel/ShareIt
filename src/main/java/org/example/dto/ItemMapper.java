package org.example.dto;

import org.example.Item.Item;

public class ItemMapper {

    public static ItemDto toDto(Item item) {
        return ItemDto.builder()
                .id(item.getId())
                .name(item.getName())
                .beenOnLoan(item.getBeenOnLoan())
                .description(item.getDescription())
                .status(item.getStatus())
                .build();
    }

    public static Item toModel(ItemDto dto) {
        return Item.builder()
                .id(dto.getId())
                .name(dto.getName())
                .beenOnLoan(dto.getBeenOnLoan())
                .description(dto.getDescription())
                .status(dto.getStatus())
                .build();
    }
}
