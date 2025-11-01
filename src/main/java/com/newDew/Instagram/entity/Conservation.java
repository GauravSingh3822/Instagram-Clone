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
@Table(name = "Conservation")
public class Conservation {
    @Id
    private UUID uuid;
    private UUID senderId;
    private UUID receiverId;
    private Timestamp lastMessageAt;
    private String message;
    private Timestamp sentAt;
    private Timestamp readAt;
    private Boolean isRead;
    private Timestamp deletedAt;
    private Boolean isDeleted;
    private Boolean isSaved;
    private Boolean isLiked;
    private Boolean isBookmarked;
}
