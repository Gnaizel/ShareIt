package org.example.Item;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NonNull;
import org.example.enums.ItemStatus;

@Data
@Builder(toBuilder = true)
public class Item {
    private Long id;
    private long ownerId;
    private int beenOnLoan;
    @NonNull
    private String name;
    @NonNull
    private String description;
    @NonNull
    private ItemStatus status;
}
