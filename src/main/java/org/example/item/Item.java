package org.example.item;

import lombok.Builder;
import lombok.Data;
import org.example.enums.ItemStatus;

@Data
@Builder(toBuilder = true)
public class Item {
    private long id;
    private long ownerId;
    private String name;
    private String description;
    private String ownerName;
    private ItemStatus status;
}
