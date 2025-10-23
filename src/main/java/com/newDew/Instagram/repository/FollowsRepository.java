package com.newDew.Instagram.repository;

import com.newDew.Instagram.entity.Follows;
import org.springframework.data.repository.Repository;

import java.util.UUID;

public interface FollowsRepository extends Repository<Follows, UUID> {
}