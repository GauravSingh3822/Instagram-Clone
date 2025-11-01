package com.newDew.Instagram.controller;

import com.newDew.Instagram.service.NotificationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/notifications")
public class NotificationsControllerDemoRestAPI {
    private final NotificationService notificationService;
}
