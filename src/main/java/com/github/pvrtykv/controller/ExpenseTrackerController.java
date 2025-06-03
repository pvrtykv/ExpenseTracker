package com.github.pvrtykv.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExpenseTrackerController {

    @GetMapping("/")
    public String welcomeMessage() {
        return "Welcome to the Expense Tracker API!";
    }
}
