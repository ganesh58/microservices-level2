package com.example.ratingsdataservice.resources;

import com.example.ratingsdataservice.model.Rating;
import com.example.ratingsdataservice.model.UserRating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ratingsdata")
class RatingsResource {

    @RequestMapping("/{movieId}")
    public Rating getMovieRating(@PathVariable("movieId") String movieId)
    {
        return new Rating(movieId, 4);
    }




    @RequestMapping("users/{userId}")
    public UserRating getUserRating(@PathVariable("userId") String  userId)
    {

        UserRating userRating = new UserRating();
        userRating.initData(userId);
        return  userRating;
    }

}