package com.newDew.Instagram.controller;

import com.newDew.Instagram.service.CommentsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/comments")
public class CommentsControllerDemoRestAPI {
    private final CommentsService commentsService;
}
