package com.newDew.Instagram.controller;

import com.newDew.Instagram.service.PostsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/post")
public class PostsControllerDemoRestAPI {
    private final PostsService postsService;
}
