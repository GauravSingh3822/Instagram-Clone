package com.newDew.Instagram.repository;

import com.newDew.Instagram.entity.PostMedia;
import org.springframework.data.repository.Repository;

import java.util.UUID;

public interface PostMediaRepository extends Repository<PostMedia, UUID> {
}