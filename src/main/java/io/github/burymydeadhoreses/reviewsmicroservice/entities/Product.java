package io.github.burymydeadhoreses.reviewsmicroservice.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue
    private UUID id;

    private String name;

    private String description;

    @OneToMany
    private List<Review> reviews;
}