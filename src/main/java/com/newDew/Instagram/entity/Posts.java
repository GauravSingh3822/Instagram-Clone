package com.newDew.Instagram.entity;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;
import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
@Table(name = "Posts")
public class Posts {
    @Id
    private UUID id;
    private String title;
    private String content;
    private String image;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private Timestamp deletedAt;
    private Boolean isDeleted;
    private int likesCount;
    private int commentsCount;
    private Boolean isArchived;
    private Boolean isReported;
    private Boolean isSaved;
    private Boolean isLiked;
    private Boolean isBookmarked;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private UserEntity user;

}
