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
@Table(name = "Follows")
public class Follows {
    @Id
    private UUID uuid;
    private UUID followerId;
    private UUID followingId;
    private String caption;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    
    private Enum status;

}
