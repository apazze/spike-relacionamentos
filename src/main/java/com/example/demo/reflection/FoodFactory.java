package com.example.demo.reflection;

public class FoodFactory {
    public Food getFood(String order) {
        try {
            String classname = order.substring(0, 1).toUpperCase() + order.substring(1).toLowerCase();
            return (Food) Class.forName("com.example.demo.reflection."+classname).newInstance();
        } catch (Exception e) {
            return null;
        }
    }
}
