package com.example.cardapio.controller;

import com.example.cardapio.food.Food;
import com.example.cardapio.food.FoodRepository;
import com.example.cardapio.food.FoodResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("food")
public class FoodController {
    @Autowired
    private FoodRepository repository;
    @GetMapping
    public List<FoodResponseDTO> getAll(){
        List<Food> foodList = repository.findAll().stream().map(new FoodResponseDTO());
        return foodList;
    }
}
