package com.newDew.Instagram.repository;

import com.newDew.Instagram.entity.Posts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PostsRepository extends JpaRepository<Posts, UUID> {
}