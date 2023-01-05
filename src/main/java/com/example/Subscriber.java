package com.example;

import io.micronaut.core.annotation.Introspected;
import io.micronaut.core.annotation.NonNull;
import io.micronaut.core.annotation.Nullable;

import javax.validation.constraints.NotBlank;

@Introspected
public class Subscriber {

    @NonNull
    @NotBlank
    private final String email;

    @NonNull
    @NotBlank
    private final String username;

    @Nullable
    private final String personalName;

    public Subscriber(@NonNull String email, String username, @Nullable String personalName) {
        this.email = email;
        this.username = username;
        this.personalName = personalName;
    }

    @NonNull
    public String getEmail() {
        return email;
    }

    @NonNull
    public String getUsername() {
        return username;
    }

    @Nullable
    public String getPersonalName() {
        return personalName;
    }
}
