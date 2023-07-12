package com.example.cardapio.food;

import org.springframework.data.jpa.repository.JpaRepository;

import java.nio.file.LinkOption;

public interface FoodRepository extends JpaRepository<Food, Long> {
}
