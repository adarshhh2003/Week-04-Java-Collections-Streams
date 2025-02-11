package com.personalizedmealplan;

public class Meal<T extends MealPlan>{
    private String mealName;
    private T mealType;

    public Meal(String mealName, T mealType) {
        this.mealName = mealName;
        this.mealType = mealType;
    }

    public String getMealName() {
        return mealName;
    }

    public T getMealType() {
        return mealType;
    }

    public String toString() {
        return "Meal: " + mealName + " (Type: " + mealType.getMealType() + " )";
    }
}
