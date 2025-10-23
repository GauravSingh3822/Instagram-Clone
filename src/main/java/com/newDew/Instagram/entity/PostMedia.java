package com.newDew.Instagram.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.sql.Timestamp;
import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
@Table(name = "PostMedia")
public class PostMedia {
    @Id
    private UUID uuid;
    private UUID postId;
    private String mediaUrl;
    private String mediaType;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private Timestamp deletedAt;
    private Boolean isDeleted;
    private Boolean isArchived;
    private Boolean isReported;
    private Boolean isSaved;
    private Boolean isLiked;
    private Boolean isBookmarked;

}
