package com.newDew.Instagram.repository;

import com.newDew.Instagram.entity.Likes;
import org.springframework.data.repository.Repository;

import java.util.UUID;

public interface LikesRepository extends Repository<Likes, UUID> {
}