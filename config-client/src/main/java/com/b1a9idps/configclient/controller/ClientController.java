package com.b1a9idps.configclient.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.b1a9idps.configclient.properties.ClientProperties;

@RestController
public class ClientController {
    private final ClientProperties clientProperties;

    public ClientController(ClientProperties clientProperties) {
        this.clientProperties = clientProperties;
    }

    @GetMapping
    public Map<String, String> index() {
        return Map.of("message", clientProperties.message());
    }
}
