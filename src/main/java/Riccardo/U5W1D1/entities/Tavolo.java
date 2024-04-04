package Riccardo.U5W1D1.entities;

import Riccardo.U5W1D1.enums.Stato;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Tavolo {
    private int numero;
    private int numeroCopertiMassimo;
    private Stato stato;

    public Tavolo(int numero, int numeroCopertiMassimo, Stato stato) {
        this.numero = numero;
        this.numeroCopertiMassimo = numeroCopertiMassimo;
        this.stato = stato;
    }

    @Override
    public String toString() {
        return "Tavolo{" +
                "numero=" + numero +
                ", numeroCopertiMassimo=" + numeroCopertiMassimo +
                ", stato='" + stato + '\'' +
                '}';
    }
}
