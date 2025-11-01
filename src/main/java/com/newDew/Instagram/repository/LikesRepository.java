package com.newDew.Instagram.repository;

import com.newDew.Instagram.entity.Likes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface LikesRepository extends JpaRepository<Likes, UUID> {
}