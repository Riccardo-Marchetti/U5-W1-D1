package Riccardo.U5W1D1.entities;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Menu {
//  ATTRIBUTI
    private List<OggettiDelMenu> oggettiDelMenu;

//    COSTRUTTORE
    public Menu(List<OggettiDelMenu> oggettiDelMenu) {
        this.oggettiDelMenu = oggettiDelMenu;
    }

//    TO STRING
    @Override
    public String toString() {
        return "Menu{" +
                "oggettiDelMenu=" + oggettiDelMenu +
                '}';
    }
}
