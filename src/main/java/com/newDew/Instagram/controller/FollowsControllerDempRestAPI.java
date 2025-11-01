package com.newDew.Instagram.controller;
import com.newDew.Instagram.service.FollowsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/follows")
public class FollowsControllerDempRestAPI {
    private final FollowsService followsService;
}
