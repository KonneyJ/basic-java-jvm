package org.konneyj.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConfigService {
    private ObjectMapper objectMapper;

    @Autowired
    public ConfigService(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }
}
