package com.mmorenodev.videogames_api.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

@Entity
@Table(name = "games")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "El título es obligatorio")
    @Column(nullable = false)
    private String title;

    @NotBlank(message = "El género es obligatorio")
    private String genre;

    @NotBlank(message = "El estudio es obligatorio")
    private String studio;

    @Min(value = 1970, message = "Año no válido")
    private int releaseYear;

    @DecimalMin(value = "0.0")
    @DecimalMax(value = "10.0")
    private double rating;

    private String platform;
    private String description;
}