package simonellifabio.u5d1.entities;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String name;
    private List<Topping> toppings;
    private double price;
    private int calories;

    public Pizza(String name, double price, int calories){
        this.name = name;
        this.price = price;
        this.calories = calories;
        this.toppings = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Topping> getToppings() {
        return toppings;
    }

    public void setToppings(List<Topping> toppings) {
        this.toppings = toppings;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void addTopping(Topping topping) {
        this.toppings.add(topping);
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }
}
