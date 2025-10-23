package com.newDew.Instagram.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.security.Timestamp;
import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
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

}
