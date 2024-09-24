package com.example.simple_board.board.service;

import com.example.simple_board.board.db.BoardEntity;
import com.example.simple_board.board.model.BoardDto;
import com.example.simple_board.post.service.PostConverter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BoardConverter {

    private final PostConverter postConvertor;

    //Convert는 객체의 데이터 형식을 다른 형식으로 변환하는 과정, 주로 Entity와 DTO간의 변환을 의미
    // Entity -> DTO 로 변환
    public BoardDto toDto(BoardEntity boardEntity){

        var postList = boardEntity.getPostList()
                .stream()
                .map(postConvertor::toDto)
                .collect(Collectors.toList());

        return BoardDto.builder()
                .id(boardEntity.getId())
                .boardName(boardEntity.getBoardName())
                .status(boardEntity.getStatus())
                .postList(postList)
                .build()
                ;
    }
}
