package com.fastcampus.projectboard.domain;

import java.time.LocalDateTime;

public class ArtcleComment {
    private Long id;
    private Article article;
    private String content;

    private LocalDateTime createAt;
    private String createBy;
    private LocalDateTime modifyAt;
    private String modifyBy;
}
