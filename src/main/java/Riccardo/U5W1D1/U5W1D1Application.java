package Riccardo.U5W1D1;

import Riccardo.U5W1D1.entities.Menu;
import Riccardo.U5W1D1.entities.OggettiDelMenu;
import Riccardo.U5W1D1.entities.Pizze;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class U5W1D1Application {

	public static void main(String[] args) {
		SpringApplication.run(U5W1D1Application.class, args);

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(U5W1D1Application.class);

		Menu menu = ctx.getBean(Menu.class);
		System.out.println("MENU");
		for (OggettiDelMenu oggetti : menu.getOggettiDelMenu()){
			System.out.println(oggetti.getNome() + ": (" + oggetti.getInformazioni() + ") - Calorie: " +  oggetti.getCalorie() + " - Prezzo: " + oggetti.getPrezzo() + "€");
		}
	}

}
