package com.sparta.sample_currency.dto;

import com.sparta.sample_currency.entity.User;
import lombok.Getter;

@Getter
public class UserResponseDto {
    private Long id;

    private String name;
    private String email;
    private String status;

    public UserResponseDto(User user) {
        this.id = user.getId();
        this.name = user.getName();
        this.email = user.getEmail();
        this.status = user.getStatus();
    }

    public UserResponseDto(Long id, String name, String email, String status) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.status = status;
    }

    public static UserResponseDto toDto(User user) {
        return new UserResponseDto(
                user.getId(),
                user.getName(),
                user.getEmail(),
                user.getStatus()
        );
    }
}
