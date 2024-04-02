package Riccardo.U5W1D1.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class OggettiDelMenu {
    //  ATTRIBUTI
    protected String nome;
    protected double prezzo;
    protected int calorie;
    protected String informazioni;

    //  COSTRUTTORE
    public OggettiDelMenu(String nome, double prezzo, int calorie, String informazioni) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.calorie = calorie;
        this.informazioni = informazioni;
    }

    //  TO STRING
    @Override
    public String toString() {
        return "OggettiDelMenu{" +
                "nome='" + nome + '\'' +
                ", prezzo=" + prezzo +
                ", calorie=" + calorie +
                ", informazioniNutrizionali='" + informazioni + '\'' +
                '}';
    }
}
