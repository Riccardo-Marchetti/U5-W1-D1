package Riccardo.U5W1D1;

import Riccardo.U5W1D1.entities.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BeansConfiguration {
    @Bean
    public Toppings prosciutto(){
        return new Toppings("Prosciutto", 1.50, 100, "Prosciutto crudo di parma");
    }
    @Bean
    public Toppings salaminoPiccante(){
        return new Toppings("Salamino piccante", 1.50, 120, "Piccante il giusto");
    }
    @Bean
    public Toppings salsaDiPomodoro(){
       return  new Toppings("Salsa di pomodoro", 1.00, 25, "Salsa di pomodori freschi");
    }
    @Bean
    public Toppings mozzarella(){
        return new Toppings("Mozzarella", 1.00, 230, "Mozzarella di bufala");
    }
    @Bean
    public List<Toppings> condimentiBase(){
        Toppings salsaDiPomodoro = salsaDiPomodoro();
        Toppings mozzarella = mozzarella();
        List<Toppings> topping = new ArrayList<>();
        topping.add(salsaDiPomodoro);
        topping.add(mozzarella);
        return topping;
    }
    @Bean
    public Pizze pizzaMargherita(){
        List<Toppings> condimentiBase = condimentiBase();
        return new Pizze("Pizza Margherita", 6.00, 700, "Pomodoro e mozzarella", condimentiBase);
    }
    @Bean
    public Pizze pizzaProsciutto(){
        List<Toppings> condimentiBase = condimentiBase();
        Toppings prosciutto = prosciutto();
        List<Toppings> condimentiPizzaProsciutto = new ArrayList<>(condimentiBase);
        condimentiPizzaProsciutto.add(prosciutto);
        return new Pizze("Pizza Prosciutto", 7.50, 800, "Prosciutto crudo", condimentiPizzaProsciutto);
    }
    @Bean
    public Pizze pizzaSalamino(){
        List<Toppings> condimentiBase = condimentiBase();
        Toppings salaminoPiccante = salaminoPiccante();
        List<Toppings> condimentiPizzaSalaminoPiccante = new ArrayList<>(condimentiBase);
        condimentiPizzaSalaminoPiccante.add(salaminoPiccante);
        return new Pizze("Pizza Salamino Piccante", 7.50, 820, "Salame piccante", condimentiPizzaSalaminoPiccante);
    }
    @Bean
    public Drinks cocaCola(){
        return new Drinks("Coca Cola", 3.50, 115, "0,33 l");
    }
    @Bean
    public Drinks acqua(){
        return new Drinks("Acqua", 1.00, 0, "0,5 l");
    }
    @Bean
    public Drinks birra(){
        return new Drinks("Birra", 4.50, 120, "0,33 l");
    }
    @Bean
    public List<Pizze> listaPizze(){
        List<Pizze> listaPizze = new ArrayList<>();
        listaPizze.add(pizzaMargherita());
        listaPizze.add(pizzaProsciutto());
        listaPizze.add(pizzaSalamino());
        return listaPizze;
    }
    @Bean
    public List<Toppings> listaToppings(){
        List<Toppings> listaToppings = new ArrayList<>();
        listaToppings.add(prosciutto());
        listaToppings.add(salaminoPiccante());
        listaToppings.add(mozzarella());
        listaToppings.add(salsaDiPomodoro());
        return listaToppings;
    }
    @Bean
    public List<Drinks> listaDrinks(){
        List<Drinks> listaDrinks = new ArrayList<>();
        listaDrinks.add(acqua());
        listaDrinks.add(cocaCola());
        listaDrinks.add(birra());
        return listaDrinks;
    }
    @Bean
    public List<OggettiDelMenu> oggettiDelMenu(){
        List<Pizze> pizze = listaPizze();
        List<Toppings> condimenti = listaToppings();
        List<Drinks> drinks = listaDrinks();
        List<OggettiDelMenu> oggettiDelMenu = new ArrayList<>();
        oggettiDelMenu.addAll(pizze);
        oggettiDelMenu.addAll(condimenti);
        oggettiDelMenu.addAll(drinks);
        return oggettiDelMenu;
    }
    @Bean
    public Menu menu(){
        List<OggettiDelMenu> oggettiDelMenu = oggettiDelMenu();
        return new Menu(oggettiDelMenu);
    }
}
