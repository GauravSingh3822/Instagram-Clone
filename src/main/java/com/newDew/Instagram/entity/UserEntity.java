package com.newDew.Instagram.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.springframework.graphql.data.federation.EntityMapping;

import java.security.Timestamp;
import java.util.List;
import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "users")
public class UserEntity {
    @Id
    private UUID id;
    private String userName;
    private String email;
    private String password;
    private String fullName;
    private String bio;
    private String profileImageUrl;
    private String coverImageUrl;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private Boolean isPrivate;
    private String roles;
    private List<Posts> posts;


}
