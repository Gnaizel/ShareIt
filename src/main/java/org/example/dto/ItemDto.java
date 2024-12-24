package org.example.dto;

import lombok.Builder;
import lombok.Data;
import org.example.enums.ItemStatus;

@Data
@Builder(toBuilder = true)
public class ItemDto {
    private long id;
    private int beenOnLoan;
    private String name;
    private String description;
    private ItemStatus status;
}
