package com.example.simple_board.post.service;

import com.example.simple_board.post.db.PostEntity;
import com.example.simple_board.post.model.PostDto;
import org.springframework.stereotype.Service;

@Service
public class PostConverter {


    //Convert는 객체의 데이터 형식을 다른 형식으로 변환하는 과정, 주로 Entity와 DTO간의 변환을 의미
    // Entity -> DTO 로 변환
    public PostDto toDto(PostEntity postEntity){
        return PostDto.builder()
                .id(postEntity.getId())
                .userName(postEntity.getUserName())
                .status(postEntity.getStatus())
                .email(postEntity.getEmail())
                .password(postEntity.getPassword())
                .title(postEntity.getTitle())
                .content(postEntity.getContent())
                .postedAt(postEntity.getPostedAt())
                .boardId(postEntity.getBoardEntity().getId())
                .build()
                ;
    }
}
