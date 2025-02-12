package io.github.burymydeadhoreses.reviewsmicroservice.repositories;

import io.github.burymydeadhoreses.reviewsmicroservice.entities.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ReviewRepository extends JpaRepository<Review, UUID>  {
}
