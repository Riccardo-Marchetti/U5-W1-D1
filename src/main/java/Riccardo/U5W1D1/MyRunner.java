package Riccardo.U5W1D1;

import Riccardo.U5W1D1.entities.*;
import Riccardo.U5W1D1.enums.Stato;
import Riccardo.U5W1D1.enums.StatoOrdine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;
import java.time.LocalDateTime;

@Component
public class MyRunner implements CommandLineRunner {

    @Autowired
    private Menu menu;

    @Override
    public void run(String... args) throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(U5W1D1Application.class);

        Menu menu = ctx.getBean(Menu.class);

        menu.scriviMenu();
        Tavolo tavolo = new Tavolo(5, 4, Stato.LIBERO);
        Ordine ordine1 = new Ordine(1, tavolo, StatoOrdine.INCORSO, 4, LocalDateTime.of(2024, 3, 4, 12, 30, 0, 0));
        ordine1.aggiungiElementoMenu(menu.getPizzaList().get(1));
        ordine1.aggiungiElementoMenu(menu.getPizzaList().get(1));
        ordine1.aggiungiElementoMenu(menu.getPizzaList().get(0));
        ordine1.aggiungiElementoMenu(menu.getPizzaList().get(2));
        ordine1.aggiungiElementoMenu(menu.getDrinkList().get(1));
        ordine1.aggiungiElementoMenu(menu.getDrinkList().get(2));
        ordine1.aggiungiElementoMenu(menu.getDrinkList().get(0));

        System.out.println("Ordine");
        System.out.println("Numero ordine: " + ordine1.getNumeroOrdine());
        System.out.println("Tavolo: " + ordine1.getTavolo());
        System.out.println("Prodotti ordinati:");
        ordine1.getOggettiDelMenu().forEach(a -> System.out.println(a.getNome() + ": (" + a.getInformazioni() + ") - Calorie: " +  a.getCalorie() + " - Prezzo: " + a.getPrezzo() + "€"));
        System.out.println("Data: " + ordine1.getLocalTime());
        System.out.println(ordine1.prezzoTotale());

    }
}
