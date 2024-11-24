package com.sparta.sample_currency.dto;

import com.sparta.sample_currency.entity.User;
import lombok.Getter;

@Getter
public class UserRequestDto {
    private String name;
    private String email;

    public User toEntity() {
        return new User(
                this.name,
                this.email
        );
    }
}
