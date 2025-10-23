package com.newDew.Instagram.repository;

import com.newDew.Instagram.entity.UserEntity;
import org.springframework.data.repository.Repository;

import java.util.UUID;

public interface UserEntityRepository extends Repository<UserEntity, UUID> {
}