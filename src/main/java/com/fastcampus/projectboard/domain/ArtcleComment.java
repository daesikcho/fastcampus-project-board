package com.fastcampus.projectboard.domain;

import java.time.LocalDateTime;

public class ArtcleComment {
    private Long id;
    private Article article;   //게시글 (ID)
    private String content;   //본문

    private LocalDateTime createAt;  //생성일
    private String createBy;  //생성자
    private LocalDateTime modifyAt;   //수정자
    private String modifyBy; //수정일
}
