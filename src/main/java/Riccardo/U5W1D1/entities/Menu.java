package Riccardo.U5W1D1.entities;

import lombok.Getter;
import lombok.Setter;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Menu {
//  ATTRIBUTI
    private List<Pizze> pizzaList;
    private List<Drinks> drinkList;
    private List<Toppings> toppingList;

//    COSTRUTTORE
    public Menu(List<Pizze> pizzaList, List<Drinks> drinkList, List<Toppings> toppingList) {
        this.pizzaList = pizzaList;
        this.drinkList = drinkList;
        this.toppingList = toppingList;
    }

    public Menu() {
        this.pizzaList = new ArrayList<>();
        this.drinkList = new ArrayList<>();
        this.toppingList = new ArrayList<>();
    }
//    TO STRING

    @Override
    public String toString() {
        return "Menu{" +
                "pizzaList=" + pizzaList +
                ", drinkList=" + drinkList +
                ", toppingList=" + toppingList +
                '}';
    }

    public void scriviMenu(){
        System.out.println("MENU");
        System.out.println("Pizza");
        pizzaList.forEach(a -> System.out.println(a.getNome() + ": (" + a.getInformazioni() + ") - Calorie: " +  a.getCalorie() + " - Prezzo: " + a.getPrezzo() + "€"));
        System.out.println();
        System.out.println("Condimenti");
        toppingList.forEach(a -> System.out.println(a.getNome() + ": (" + a.getInformazioni() + ") - Calorie: " +  a.getCalorie() + " - Prezzo: " + a.getPrezzo() + "€"));
        System.out.println();
        System.out.println("Drinks");
        drinkList.forEach(a -> System.out.println(a.getNome() + ": (" + a.getInformazioni() + ") - Calorie: " +  a.getCalorie() + " - Prezzo: " + a.getPrezzo() + "€"));
    }
}
