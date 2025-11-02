package com.newDew.Instagram.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
@Table(
        name = "users",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = {"email", "username"})
        },
        indexes = {
                @Index(columnList = "email"),
                @Index(columnList = "username"),
                @Index(columnList = "id")
        }
)
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @NotBlank(message = "Username is required")
    @Size(min = 3, max = 20, message = "Username must be 3–20 characters long")
    @Column(name = "username", nullable = false, unique = true)
    private String userName;

    @NotBlank(message = "Email is required")
    @Email(message = "Invalid email format")
    @Column(name = "email", nullable = false, unique = true)
    private String email;


    @NotBlank(message = "Password cannot be empty")
    @Size(min = 8, message = "Password must be at least 8 characters long")
    private String password;


    @NotBlank(message = "Full name cannot be empty")
    @Size(max = 50, message = "Full name can be up to 50 characters")
    private String fullName;


    @Size(max = 160, message = "Bio can be up to 160 characters")
    private String bio;


    @Pattern(
            regexp = "^(http(s?):)([/|.|\\w|\\s|-])*\\.(?:jpg|gif|png)$",
            message = "Profile image URL must be valid and end with .jpg/.png/.gif"
    )
    private String profileImageUrl;

    @Pattern(
            regexp = "^(http(s?):)([/|.|\\w|\\s|-])*\\.(?:jpg|gif|png)$",
            message = "Cover image URL must be valid and end with .jpg/.png/.gif"
    )
    private String coverImageUrl;


    @Size(max = 100, message = "Location must be up to 100 characters")
    private String location;

    @Pattern(
            regexp = "^(https?://)?([\\w-]+\\.)+[\\w-]{2,}(/.*)?$",
            message = "Invalid website URL"
    )
    private String website;

    @Pattern(regexp = "^(Male|Female|Other)$", message = "Gender must be Male, Female, or Other")
    @Column(name = "gender", nullable = false)
    @Enumerated(EnumType.STRING)
    private Gender gender;


    @Past(message = "Date of birth must be in the past")
    @Temporal(TemporalType.DATE)
    @Column(name = "dob")
    private Date dob;


    @CreationTimestamp
    @Column(name = "Created", updatable = false)
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Column(name = "is_private")
    private Boolean isPrivate = false;


    @Enumerated(EnumType.STRING)
    @Column(name = "roles", nullable = false)
    private Role roles;

    @PrePersist
    public void setDefaultRole() {
        if (roles == null) {
            roles = Role.USER;
        }
    }

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Posts> posts;
}