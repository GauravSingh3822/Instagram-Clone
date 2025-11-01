package com.newDew.Instagram.repository;

import com.newDew.Instagram.entity.Notifications;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface NotificationsRepository extends JpaRepository<Notifications, UUID> {
}