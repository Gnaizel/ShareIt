package org.example.user;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Builder(toBuilder = true)
@EqualsAndHashCode(of = "email")
public class User {
    private long id;
    private String name;
    private String login;
    private String email;
}
