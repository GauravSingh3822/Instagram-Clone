package com.newDew.Instagram.repository;

import com.newDew.Instagram.entity.PostMedia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PostMediaRepository extends JpaRepository<PostMedia, UUID> {
}