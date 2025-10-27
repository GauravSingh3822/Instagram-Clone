package com.newDew.Instagram.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "build")
@Data
public class BuildInfo {

    private String version;
    private String buildTime;
    private String buildNumber;
    private String buildType;
    private String buildHost;
    private String commitId; // optional - useful for Git integration
    private String branch;   // optional - useful for knowing from which branch build was made

}
