package com.example.simple_board.board.model;

import com.example.simple_board.post.db.PostEntity;
import com.example.simple_board.post.model.PostDto;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(value = PropertyNamingStrategies.SnakeCaseStrategy.class)
public class BoardDto {
    /**
     * DTO는 데이터 전송을 위한 전용 객체입니다. 이는 엔티티(Entity)와 구분되는 개념으로,
     * 엔티티는 보통 데이터베이스와 직접 연관된 객체이지만, DTO는 주로 계층 간의 데이터 전송에 사용됩니다.
     * Entity: 데이터베이스와 직접 매핑되는 객체.
     * DTO: 데이터 전송을 위한 객체로, 특정 API 요청 또는 응답에 필요한 정보만 담습니다.
     */
    private Long id;
    private String boardName;
    private String status;
    private List<PostDto> postList = List.of();
}
