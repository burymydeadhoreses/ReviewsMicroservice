package io.github.burymydeadhoreses.reviewsmicroservice.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
public class Review {
    @Id
    @GeneratedValue
    private UUID id;

    private String content;
}
