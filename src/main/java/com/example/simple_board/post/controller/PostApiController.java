package com.example.simple_board.post.controller;

import com.example.simple_board.post.db.PostEntity;
import com.example.simple_board.post.model.PostRequest;
import com.example.simple_board.post.model.PostViewRequest;
import com.example.simple_board.post.service.PostService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/post")
@RequiredArgsConstructor
public class PostApiController {

    private final PostService postService;

    @PostMapping("")
    public PostEntity create(
            @Valid
            @RequestBody
            PostRequest postRequest
    ){
        return postService.create(postRequest);
    }

    @PostMapping("/view") //비회원 게시판이므로 id받아와서 getmapping이 아니라 postmapping 으로 받아오는 점 참고
    public PostEntity view(
            @Valid
            @RequestBody
            PostViewRequest postViewRequest
    ){
        return postService.view(postViewRequest);

    }

    @GetMapping("/all")
    public List<PostEntity> list(){
        return postService.all();
    }

    @PostMapping("/delete")
    public void delete(
            @Valid
            @RequestBody
            PostViewRequest postViewRequest
    ){
        postService.delete(postViewRequest);
    }
}
