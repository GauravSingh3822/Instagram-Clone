package com.newDew.Instagram.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
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
@Table(
        name = "posts",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = {"id"})
        },
        indexes = {
                @Index(columnList = "id"),
                @Index(columnList = "title")
        }
)
public class Posts {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;


    @NotBlank(message = "Post title cannot be empty")
    @Size(max = 150, message = "Title can have up to 150 characters")
    @Column(nullable = false)
    private String title;

    @NotBlank(message = "Post content cannot be empty")
    @Size(max = 2000, message = "Content can have up to 2000 characters")
    @Column(length = 2000)
    private String content;

    @Pattern(
            regexp = "^https?:\\/\\/[^\\s]+?\\.(jpg|gif|png)$",
            message = "Invalid image URL format (must end with .jpg, .png, or .gif)"
    )
    @Column(name = "image")
    private String image;

    @CreationTimestamp
    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Column(name = "deleted_at")
    @Temporal(TemporalType.TIME)
    private LocalDateTime deletedAt;


    @Column(name = "is_deleted")
    private Boolean isDeleted = false;

    @Min(value = 0, message = "Likes count cannot be negative")
    @Column(name = "likes_count")
    private int likesCount;

    @Min(value = 0, message = "Comments count cannot be negative")
    @Column(name = "comments_count")
    private int commentsCount;

    @Column(name = "is_archived")
    private Boolean isArchived = false;

    @Column(name = "is_reported")
    private Boolean isReported = false;

    @Column(name = "is_saved")
    private Boolean isSaved = false;

    @Column(name = "is_liked")
    private Boolean isLiked = false;

    @Column(name = "is_bookmarked")
    private Boolean isBookmarked = false;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    private UserEntity user;


    @PrePersist
    public void prePersist() {
        if (isDeleted == null) {isDeleted = false;}
        if (isArchived == null) { isArchived = false;}
        if (isReported == null) { isReported = false; }
        if (isSaved == null) { isSaved = false; }
        if (isLiked == null) { isLiked = false;}
        if (isBookmarked == null) { isBookmarked = false;}
        if (likesCount < 0) { likesCount = 0;}
        if (commentsCount < 0) { commentsCount = 0;}
    }
}