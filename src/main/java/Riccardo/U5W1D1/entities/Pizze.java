package Riccardo.U5W1D1.entities;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Pizze extends OggettiDelMenu {
//    ATTRIBUTI
    private List<Toppings> toppings;

//    COSTRUTTORE
    public Pizze(String nome, double prezzo, int calorie, String informazioni) {
        super(nome, prezzo, calorie, informazioni);
    }

    public Pizze(String nome, double prezzo, int calorie, String informazioni, List<Toppings> toppings) {
        super(nome, prezzo, calorie, informazioni);
        this.toppings = toppings;
    }

    //    TO STRING

    @Override
    public String toString() {
        return "Pizze{" +
                "toppings=" + toppings +
                ", nome='" + nome + '\'' +
                ", prezzo=" + prezzo +
                ", calorie=" + calorie +
                ", informazioni='" + informazioni + '\'' +
                '}';
    }
}
