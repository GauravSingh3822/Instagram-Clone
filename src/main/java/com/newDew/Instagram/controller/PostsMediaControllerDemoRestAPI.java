package com.newDew.Instagram.controller;

import com.newDew.Instagram.service.PostMediaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/postsMedia")
public class PostsMediaControllerDemoRestAPI {
    private final PostMediaService postMediaService;
}
