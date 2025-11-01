package com.newDew.Instagram.controller;

import com.newDew.Instagram.service.MessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/message")
public class MessagesControllerDemoRestAPI {
    private final MessageService messageService;
}
