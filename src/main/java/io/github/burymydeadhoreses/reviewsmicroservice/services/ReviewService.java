package io.github.burymydeadhoreses.reviewsmicroservice.services;

import io.github.burymydeadhoreses.reviewsmicroservice.entities.Review;
import io.github.burymydeadhoreses.reviewsmicroservice.repositories.ProductRepository;
import io.github.burymydeadhoreses.reviewsmicroservice.repositories.ReviewRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class ReviewService {
    private ReviewRepository reviewRepository;
    private ProductRepository productRepository;

    public List<Review> list(UUID id) {
        var product = productRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found"));

        return product.getReviews();
    }

    public void add(UUID id, String content) {
        var product = productRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found"));

        var review = new Review();
        review.setContent(content);

        reviewRepository.save(review);

        product.getReviews().add(review);

        productRepository.save(product);
    }
}

