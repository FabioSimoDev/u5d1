package simonellifabio.u5d1.entities;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<Pizza> pizzas;
    private List<Drink> drinks;
    private List<Topping> toppings;

    public Menu() {
        pizzas = new ArrayList<>();
        toppings = new ArrayList<>();
        drinks = new ArrayList<>();
    }

    public void addPizza(Pizza pizza) {
        pizzas.add(pizza);
    }

    public void addDrink(Drink drink) {
        drinks.add(drink);
    }

    public void printMenu() {
        System.out.println(String.format("%-20s %-10s %-10s", "Pizze", "Calorie", "Prezzo"));
        for (Pizza pizza : pizzas) {
            System.out.println(String.format("%-20s %-10d %-10.2f", pizza.getName(), pizza.getCalories(), pizza.getPrice()));
        }
        System.out.println();
        System.out.println(String.format("%-20s %-10s %-10s", "Toppings", "Calorie", "Prezzo"));
        for (Topping topping : toppings) {
            System.out.println(String.format("%-20s %-10d %-10.2f", topping.getName(), topping.getCalories(), topping.getPrice()));
        }
        System.out.println();
        System.out.println(String.format("%-20s %-10s %-10s", "Bibite", "Calorie", "Prezzo"));
        for (Drink drink : drinks) {
            System.out.println(String.format("%-20s %-10d %-10.2f", drink.getName(), drink.getCalories(), drink.getPrice()));
        }
    }


    public List<Pizza> getPizzas() {
        return pizzas;
    }

    public void setPizzas(List<Pizza> pizzas) {
        this.pizzas = pizzas;
    }

    public List<Drink> getDrinks() {
        return drinks;
    }

    public void setDrinks(List<Drink> drinks) {
        this.drinks = drinks;
    }

    public List<Topping> getToppings() {
        return toppings;
    }

    public void setToppings(List<Topping> toppings) {
        this.toppings = toppings;
    }
}

