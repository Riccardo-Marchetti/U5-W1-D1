package Riccardo.U5W1D1.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Drinks extends OggettiDelMenu {

//  COSTRUTTORE
    public Drinks(String nome, double prezzo, int calorie, String informazioni) {
        super(nome, prezzo, calorie, informazioni);
    }

    //  TO STRING
    @Override
    public String toString() {
        return "Drinks{" +
                "nome='" + nome + '\'' +
                ", prezzo=" + prezzo +
                ", calorie=" + calorie +
                ", informazioni='" + informazioni + '\'' +
                '}';
    }
}
