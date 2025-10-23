package com.newDew.Instagram.repository;

import com.newDew.Instagram.entity.Notifications;
import org.springframework.data.repository.Repository;

import java.util.UUID;

public interface NotificationsRepository extends Repository<Notifications, UUID> {
}