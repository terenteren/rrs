package com.jyujyu.review.api;

import com.jyujyu.review.api.request.CreateAndEditRestaurantRequest;
import org.springframework.web.bind.annotation.*;

@RestController
public class RestaurantApi {

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
    public String createRestaurant(
            @RequestBody CreateAndEditRestaurantRequest request
            ) {
        return "this is createRestaurant name=" + request.getName() + ", address=" + request.getAddress() + ", menus name =" + request.getMenus().get(0).getName() + ", menu[0].price = " + request.getMenus().get(0).getPrice();
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
