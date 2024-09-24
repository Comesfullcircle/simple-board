package com.example.simple_board.post.db;

import com.example.simple_board.reply.db.ReplyEntity;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Entity(name = "post")
public class PostEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long boardId;
    private String userName;
    private String password;
    private String email;
    private String status;
    private String title;
    @Column(columnDefinition = "TEXT")
    private String content;
    private LocalDateTime postedAt;

    //답변이 없을수도 있으니 답변이 안달리는 것을 default 설정
    @Transient //데이터베이스의 컬럼으로 인식되지 않도록 @Transient 어노테이션 추가
    private List<ReplyEntity> replyList = Arrays.asList();

}
