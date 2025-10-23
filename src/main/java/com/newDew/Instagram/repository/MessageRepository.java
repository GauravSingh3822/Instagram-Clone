package com.newDew.Instagram.repository;

import com.newDew.Instagram.entity.Message;
import org.springframework.data.repository.Repository;

import java.util.UUID;

public interface MessageRepository extends Repository<Message, UUID> {
}