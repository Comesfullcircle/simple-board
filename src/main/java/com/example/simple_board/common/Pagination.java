package com.example.simple_board.common;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Pagination {

    private Integer page;
    private Integer size;
    private Integer currentElements;
    private Integer TotalPage;
    private Long totalElements;
}
