# 📸 Instagram Clone Backend (Spring Boot)

A feature-rich **social media backend** built with **Spring Boot** that powers core Instagram-like functionalities — user authentication, image uploads, likes, follows, comments, notifications, and feed.

---

## 🚀 Features

### 🔐 Authentication
- User signup & login with **JWT**
- Password hashing using **BCrypt**
- Input validation using `@Valid`, `@NotBlank`, `@Email`, `@Size`
- Optional email verification

### 🖼️ Post Upload (AWS S3)
- Generate **pre-signed URLs** for direct S3 uploads
- Efficient media handling using AWS SDK v2
- Post metadata persisted in database
- Optional CDN (CloudFront) for serving images

### ❤️ Likes & Comments
- Like/unlike toggle with transactional consistency
- Comment creation with pagination
- Notification generation for post owners

### 👥 Follow System
- Follow/unfollow users
- Feed aggregation based on followed users

### 🔔 Notifications (WebSocket)
- Real-time notifications for likes, comments, and follows
- WebSocket push updates when users are online

### 🧱 Architecture Overview
Modular, layered architecture following best practices:
