package org.example.projektjava.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.util.Set;

@Entity
@Getter @Setter
@RequiredArgsConstructor @NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private String name;
    @NotBlank
    private String unit;
    @NotBlank
    private int kcal;
    @NotBlank
    private int status; //statust: 0-oczekujacy, 1-zatwierdzony, 2-ukryty
    @OneToMany
    private Set<Products_Recipe> recipies;
}
