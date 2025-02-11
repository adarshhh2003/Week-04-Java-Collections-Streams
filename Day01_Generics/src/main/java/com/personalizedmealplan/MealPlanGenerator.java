package com.personalizedmealplan;

public class MealPlanGenerator {
    public static <T extends MealPlan> Meal<T> generateMeal(String name, T mealType) {
        return new Meal<>(name, mealType);
    }
}
