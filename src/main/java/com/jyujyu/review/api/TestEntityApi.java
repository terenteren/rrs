package com.jyujyu.review.api;

import com.jyujyu.review.service.TestService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
public class TestEntityApi {

    private final TestService testService;

    @PostMapping("/test/entity/create")
    public void createTestEntity(
            @RequestBody CreateTestEntityRequest request
    ) {
        testService.create(request.getName(), request.getAge());
    }

    /**
     * 생성할때 사용한 RequestBody와 삭제할때 사용한 PathVariable를 동시에 사용한 api
     * @param id
     * @param request
     */
    @PutMapping("/test/entity/{id}")
    public void putTestEntity(
            @PathVariable Long id,
            @RequestBody CreateTestEntityRequest request
    ) {
        testService.update(id, request.getName(), request.getAge());
    }

    @DeleteMapping("test/entity/{id}")
    public void deleteTestEntity(
            @PathVariable Long id
    ) {
        testService.delete(id);
    }

    @AllArgsConstructor
    @Getter
    public static class CreateTestEntityRequest {
        private final String name;
        private final Integer age;
    }
}
