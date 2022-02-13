package com.b1a9idps.configclient.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("settings.client")
public record ClientProperties(String message) {
}
