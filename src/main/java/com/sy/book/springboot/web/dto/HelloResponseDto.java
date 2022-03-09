package com.sy.book.springboot.web.dto;

import lombok.Getter;

@Getter
public class HelloResponseDto {
    private String name;
    private int amount;

    public HelloResponseDto(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }
}
