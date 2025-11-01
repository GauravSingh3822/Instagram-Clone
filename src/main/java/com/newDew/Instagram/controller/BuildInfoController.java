package com.newDew.Instagram.controller;

import com.newDew.Instagram.config.BuildInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/info")
public class BuildInfoController {

    private final BuildInfo buildInfo;

    public BuildInfoController(BuildInfo buildInfo) {
        this.buildInfo = buildInfo;
    }

    @GetMapping("/build")
    public Map<String, Object> getBuildInfo() {
        return Map.of(
                "version", buildInfo.getVersion(),
                "buildTime", buildInfo.getBuildTime(),
                "buildNumber", buildInfo.getBuildNumber(),
                "buildType", buildInfo.getBuildType(),
                "buildHost", buildInfo.getBuildHost(),
                "commitId", buildInfo.getCommitId(),
                "branch", buildInfo.getBranch()
        );
    }
}
