package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DatabaseController {

    @Autowired
    private DatabaseChecker databaseChecker;

    @GetMapping("/check")
    public String checkDatabase() {
        return databaseChecker.checkDatabaseConnection();
    }
}