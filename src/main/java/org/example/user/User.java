package org.example.user;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NonNull;

@Data
@Builder(toBuilder = true)
@EqualsAndHashCode(of = "email")
public class User {
    private long id;
    @NonNull
    private String name;
    @NonNull
    private String login;
    @NonNull
    private String email;
    private String number;
}
