package com.jyujyu.review.api;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestLombokApi {

    @GetMapping("/test/lombok")
    public TestLombokResponseBody testLomboj() {
        return new TestLombokResponseBody("JYUJYU", 30);
    }

    @Getter
    @AllArgsConstructor
    public static class TestLombokResponseBody {
        String name;
        Integer age;
    }
}
