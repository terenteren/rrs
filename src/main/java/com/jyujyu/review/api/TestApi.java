package com.jyujyu.review.api;

import org.springframework.web.bind.annotation.*;

@RestController
public class TestApi {
    @GetMapping("/hello/world")
    public String helloWorld() {
        return "[Get] Hello, World!";
    }

    @PostMapping("/hello/world")
    public String helloWorldPost() {
        return "[Post] Hello, World!";
    }

    @PutMapping("/hello/world")
    public String helloWorldPut() {
        return "[Put] Hello, World!";
    }

    @DeleteMapping("/hello/world")
    public String helloWorldDelete() {
        return "[Delete] Hello, World!";
    }

}
