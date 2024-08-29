package com.jyujyu.review.api;

import com.jyujyu.review.api.request.CreateAndEditRestaurantRequest;
import com.jyujyu.review.model.RestaurantEntity;
import com.jyujyu.review.service.RestaurantService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class RestaurantApi {
    private final RestaurantService restaurantService;

    @GetMapping("/restaurant")
    public String getRestaurant() {
        return "this is getRestaurant";
    }

    @GetMapping("/restaurant/{restaurantId}")
    public String getRestaurant(
            @PathVariable Long restaurantId
    ) {
        return "this is getRestaurant, " + restaurantId;
    }

    @PostMapping("/restaurant")
    public RestaurantEntity createRestaurant(
            @RequestBody CreateAndEditRestaurantRequest request
            ) {
        return restaurantService.createRestaurant(request);
    }

    @PutMapping("/restaurant/{restaurantId}")
    public String editRestaurant(
            @PathVariable Long restaurantId,
            @RequestBody CreateAndEditRestaurantRequest request
    ) {
        return "this is editRestaurant, " + restaurantId + ", name=" + request.getName() + ", address=" + request.getAddress() + ", menus name =" + request.getMenus().get(0).getName() + ", menu[0].price = " + request.getMenus().get(0).getPrice();
    }

    @DeleteMapping("/restaurant/{restaurantId}")
    public String deleteRestaurant(
            @PathVariable Long restaurantId
    ) {
        return "this is deleteRestaurant, " + restaurantId;
    }

}
