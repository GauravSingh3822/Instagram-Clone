package com.newDew.Instagram.repository;

import com.newDew.Instagram.entity.Comments;
import org.springframework.data.repository.Repository;

import java.util.UUID;

public interface CommentsRepository extends Repository<Comments, UUID> {
}