package com.newDew.Instagram.entity;

import jakarta.persistence.*;
import jakarta.websocket.OnMessage;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
@Table(name = "PostMedia",
        uniqueConstraints = {
        @UniqueConstraint(columnNames = {"uuid","postId","mediaUrl"})},
        indexes = {
        @Index(columnList = "uuid"),
        @Index(columnList = "postId"),
        @Index(columnList = "mediaUrl")}

)
public class PostMedia {
    @Id
    @Column(name = "PostMediaId", updatable = false, nullable = false)
    private UUID uuid;

    @Column(name = "postId", nullable = false)
    private UUID postId;

    @Column(name = "mediaUrl", nullable = false)
    private String mediaUrl;

    @Column(name = "mediaType", nullable = false)
    @Enumerated(EnumType.STRING)
    private MediaType mediaType;

    @Column(name = "mediaCreated")
    @CreationTimestamp
    private LocalDateTime createdAt;

    @Column(name = "mediaUpdated")
    @UpdateTimestamp
    private LocalDateTime updatedAt;

    @Column(name = "mediaDeleted")
    private LocalDateTime deletedAt;

    @Column(name = "isDeleted")
    private Boolean isDeleted;

    @Column(name = "isArchived")
    private Boolean isArchived;

    @Column(name = "isReported")
    private Boolean isReported;

    @Column(name = "isSaved")
    private Boolean isSaved;

    @Column(name = "isLiked")
    private Boolean isLiked;

    @Column(name = "isBookmarked")
    private Boolean isBookmarked;

}
