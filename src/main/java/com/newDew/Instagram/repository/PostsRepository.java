package com.newDew.Instagram.repository;

import com.newDew.Instagram.entity.Posts;
import org.springframework.data.repository.Repository;

import java.util.UUID;

public interface PostsRepository extends Repository<Posts, UUID> {
}