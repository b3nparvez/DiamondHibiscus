package com.company;

import java.util.ArrayList;

public class food {
    // food name, how long it last, calories, fat , sugar
    private String name;
    private boolean date;
    private int month;
    private int day;
    private double calories;
    private double fat;
    private double sugar;

    public food(String name, boolean date, int month, int day, double calories, double fat, double sugar){
        this.name = name; this.date = date; this.month = month; this.day = day;
        this.calories = calories; this.fat = fat; this.sugar = sugar;
    }//end of constructore food




    public String getName() {
        return name;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public double getCalories() {
        return calories;
    }

    public double getFat() {
        return fat;
    }

    public double getSugar() {
        return sugar;
    }
}//end of main food
