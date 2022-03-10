package com.sy.book.springboot.web.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PostsUpdateDto {
    private String title;
    private String content;

    @Builder
    public PostsUpdateDto(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
