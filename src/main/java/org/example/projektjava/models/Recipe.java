package org.example.projektjava.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.util.Set;

@Entity
@Getter
@Setter
@RequiredArgsConstructor @NoArgsConstructor
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private String name;
    private String description;
    @NotBlank
    private int owner;
    @NotBlank
    private int kcal;
    @OneToMany
    private Set<Products_Recipe> products;
    @OneToMany
    private Set<User_Recipes> sharedToUsers;
}
