package simonellifabio.u5d1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import simonellifabio.u5d1.entities.*;

import java.util.List;

@Configuration
public class BeansConfiguration {

    @Bean
    public Topping cheese() {
        return new Topping("Formaggio", 0.69, 92);
    }

    @Bean
    public Topping ham() {
        return new Topping("Prosciutto crudo", 0.99, 35);
    }
    @Bean
    public Pizza margherita() {
        Pizza margherita = new Pizza("Margherita", 4.99, 1100);
        margherita.addTopping(cheese());
        margherita.addTopping(ham());
        return margherita;
    }

    @Bean
    public Drink cola() {
        return new Drink("Cola", 2.50, 160);
    }

    @Bean
    public Menu menu(List<Pizza> pizzas, List<Topping> toppings, List<Drink> drinks) {
        Menu menu = new Menu();
        menu.setPizzas(pizzas);
        menu.setDrinks(drinks);
        menu.setToppings(toppings);
        return menu;
    }
}
