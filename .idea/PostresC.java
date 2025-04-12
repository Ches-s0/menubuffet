package modelo;

import modelo.Postre;

/**
 *
 * @author maria
 */
public class PostresC extends Postre{

    public PostresC(String nombre, String[] ingredientes) {
        super(nombre, ingredientes);
    }

    public PostresC() {
    }

}

class almendraC extends PostresC{

    public almendraC(String nombre, String[] ingredientes) {
        super.setNombre("Tarta de Almendras");
        super.setIngredientes(new String[]{"Harina de almendras", "Huevos", "Azucar", "Mantequilla", "Extracto de almendras"});
    }
}

class mousseC extends PostresC{

    public mousseC(String nombre, String[] ingredientes) {
        super.setNombre("Mousse de chocolate sin gluten ");
        super.setIngredientes(new String[]{"Chocolate negro sin gluten", "Huevos", "Azucar", "Mantequilla"});
    }

}

class biscochoC extends PostresC{

    public biscochoC(String nombre, String[] ingredientes) {
        super.setNombre("Bizcocho de Naranja sin gluten");
        super.setIngredientes(new String[]{"Harina de arroz", "Huevos", "Azucar", "Zumo de naranja","Aceite"});
    }

}

class merengueC extends PostresC{

    public merengueC(String nombre, String[] ingredientes) {
        super.setNombre("Merengue");
        super.setIngredientes(new String[]{"Claras de huevo", "azucar", "Esencia de vainilla"});
    }


}