package Riccardo.U5W1D1.entities;

import Riccardo.U5W1D1.enums.StatoOrdine;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Ordine {
    private List<OggettiDelMenu> oggettiDelMenu;
    private int numeroOrdine;
    private Tavolo tavolo;
    private StatoOrdine statoOrdine;
    private int numeroCoperti;
    private LocalDateTime localTime;
    private double importoTotale;

    public Ordine( int numeroOrdine, Tavolo tavolo, StatoOrdine statoOrdine, int numeroCoperti, LocalDateTime localTime) {
        this.numeroOrdine = numeroOrdine;
        this.tavolo = tavolo;
        this.statoOrdine = statoOrdine;
        this.numeroCoperti = numeroCoperti;
        this.localTime = localTime;
        this.oggettiDelMenu = new ArrayList<>();
    }

    public void aggiungiElementoMenu(OggettiDelMenu elemento) {
        this.oggettiDelMenu.add(elemento);
    }
    public double prezzoCoperti(@Value("${prezzo.coperto}") double coperto){
        return coperto;
    }
    public double prezzoTotale(){
        return this.oggettiDelMenu.stream().mapToDouble(OggettiDelMenu::getPrezzo).sum() + (this.prezzoCoperti(2) * this.numeroCoperti);
    }

    @Override
    public String toString() {
        return "Ordine{" +
                "oggettiDelMenu=" + oggettiDelMenu +
                ", numeroOrdine=" + numeroOrdine +
                ", tavolo=" + tavolo +
                ", statoOrdine=" + statoOrdine +
                ", numeroCoperti=" + numeroCoperti +
                ", localTime=" + localTime +
                ", importoTotale=" + importoTotale +
                '}';
    }
}
