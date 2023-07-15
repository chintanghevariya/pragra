package org.example;

import lombok.Data;

import java.util.List;
@Data
public class Dish {
    private String dishName;
    private int calories;
    private List<String> ingredients;
    private DishType dishType;
    private int ratings;

}
