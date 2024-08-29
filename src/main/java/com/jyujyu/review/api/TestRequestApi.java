package com.jyujyu.review.api;

import org.springframework.web.bind.annotation.*;

@RestController
public class TestRequestApi {

    // Request parameter 방식
    @GetMapping("/test/param")
    public String requestParam(
            @RequestParam("name") String name,
            @RequestParam("age") int age
    ) {
        return "name: " + name + ", age: " + age;
    }

    // Path Avriable 방식
    @GetMapping("/test/path/{name}/{age}")
    public String pathVariable(
            @PathVariable("name") String name,
            @PathVariable("age") int age
    ) {
        return "name: " + name + ", age: " + age;
    }

    // Request Body 방식
    @PostMapping("/test/body")
    public String requestBody(
        @RequestBody TestRequestBody requestBody
    ) {
        return "Request Body, I am " + requestBody.name + ", " + requestBody.age;
    }

    public static class TestRequestBody {
        String name;
        Integer age;

        public TestRequestBody(String name, Integer age) {
            this.name = name;
            this.age = age;
        }
    }

}
