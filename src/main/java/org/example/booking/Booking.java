package org.example.booking;

import lombok.Data;
import org.example.enums.BookStatus;

import java.time.LocalDateTime;

@Data
public class Booking {
    private long id;
    private long bookUser;
    private long ownerId;
    private long itemId;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private BookStatus status;
}
