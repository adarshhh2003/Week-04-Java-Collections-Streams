package com.personalizedmealplan;

import java.util.Arrays;
import java.util.List;

public class PersonalizedMealPlan {
    public static void main(String[] args) {
        Meal<VegeterianMeal> vegMeal = MealPlanGenerator.generateMeal("Grilled Vegetables", new VegeterianMeal());

        Meal<VeganMeal> veganMeal = MealPlanGenerator.generateMeal("Tofu sjrsb", new VeganMeal());

        Meal<KetoMeal> ketoMeal = MealPlanGenerator.generateMeal("Chicken Bowl", new KetoMeal());

        Meal<HighProteinMeal> proteinMeal = MealPlanGenerator.generateMeal("Eggs", new HighProteinMeal());

        List<Meal<?>> meals = Arrays.asList(vegMeal, veganMeal, ketoMeal, proteinMeal);

        System.out.println("Personalized Meal Plan");

        for(Meal<?> meal: meals) {
            System.out.println(meal);
        }
    }
}
