package io.github.burymydeadhoreses.reviewsmicroservice.repositories;

import io.github.burymydeadhoreses.reviewsmicroservice.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ProductRepository extends JpaRepository<Product, UUID>  {
}
