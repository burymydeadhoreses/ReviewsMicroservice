package io.github.burymydeadhoreses.reviewsmicroservice.controllers;

import io.github.burymydeadhoreses.reviewsmicroservice.entities.Review;
import io.github.burymydeadhoreses.reviewsmicroservice.services.ReviewService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/reviews")
@AllArgsConstructor
public class ReviewController {
    private final ReviewService reviewService;

    @GetMapping("/{id}")
    public List<Review> list(@PathVariable UUID id) {
        return reviewService.list(id);
    }

    @PostMapping("/{id}")
    public void add(@PathVariable UUID id, @RequestBody Review review) {
        reviewService.add(id, review.getContent());
    }
}
