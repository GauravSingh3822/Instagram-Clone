package com.newDew.Instagram.entity;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
@Table(name = "users")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String userName;
    private String email;
    private String password;
    private String fullName;
    private String bio;
    private String profileImageUrl;
    private String coverImageUrl;
    private String location;
    private String website;
    private String gender;
    private Date dob;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private Boolean isPrivate;
    private String roles;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Posts> posts;


}
