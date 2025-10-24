package com.newDew.Instagram.controller;

import com.newDew.Instagram.service.LikesService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/likes")
public class LikesControllerDemoRestAPI {
    private final LikesService likesService;
}
