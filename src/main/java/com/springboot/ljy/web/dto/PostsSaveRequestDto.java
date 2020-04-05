package com.springboot.ljy.web.dto;

import com.springboot.ljy.domain.posts.Posts;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PostsSaveRequestDto {
    private String title;
    private String content;
    private String author;

    @Builder
    public PostsSaveRequestDto(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public Posts toEntity() {
        return Posts.builder()
                .title(title)
                .content(content)
                .author(author)
                .build();
    }
}

 // request와 response용 Dto는 View를 위한 클래스 이기 때문에 자주 변경이 필요하다.
 // Entity 클래스는 데이터베이스와 맞닿은 핵심 클래스 이므로 Entity 클래스를 용청/응답 클래스로 사용하면 안된다!