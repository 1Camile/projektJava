package org.example.projektjava.models;

import com.sun.istack.NotNull;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
@NoArgsConstructor
public class Products_Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "recipe_id")
    private Recipe recipe;
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
    @NotNull //z jakiegos powodu @NotBlank tu nie istnieje a w demo istnieje za to @NotNull tu istnieje a w demo nie istnieje
    private double quantity;
}
