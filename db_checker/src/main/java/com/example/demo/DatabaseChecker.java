package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@Service
public class DatabaseChecker {

    @Autowired
    private DataSource dataSource;

    public String checkDatabaseConnection() {
        try (Connection connection = dataSource.getConnection()) {
            return "Database connected successfully!";
        } catch (SQLException e) {
            return "Failed to connect to database. Error: " + e.getMessage();
        }
    }
}