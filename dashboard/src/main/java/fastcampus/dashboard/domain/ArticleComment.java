package fastcampus.dashboard.domain;

import java.time.LocalDateTime;

public class ArticleComment {
    private Long id;
    private Article article; // 게시글id
    private String content; // 본문
    private LocalDateTime createdAt; // 생성일시
    private LocalDateTime updatedAt; // 수정일시
    private String createdBy; // 생성자
    private String updatedBy; // 수정자

}
