package com.newDew.Instagram.controller;

import com.newDew.Instagram.service.ConservationsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/conservations")
public class ConservationsControllerDemoRestAPI {
    private final ConservationsService conversationsService;
}
