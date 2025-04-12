
package modelo;

import modelo.Postre;


public class Postres extends Postre{

    public Postres(String nombre, String[] ingredientes) {
        super(nombre, ingredientes);
    }

    public Postres() {
    }
}

class TortaChocolate extends Postres{

    public TortaChocolate(String nombre, String[] ingredientes) {
        super.setNombre("torda de chocolate");
        super.setIngredientes(new String[]{"chocolate negro", "Harina", "Azucar", "Huevos", "Mantequilla", "leche"});
    }

}

class Flan extends Postres{

    public Flan(String nombre, String[] ingredientes) {
        super.setNombre("Flan");
        super.setIngredientes(new String[]{"Leche", "Huevos", "Azucar", "Vainilla"});
    }

}

class Tiramisu extends Postres {

    public Tiramisu(String nombre, String[] ingredientes) {
        super.setNombre("Tiramisu");
        super.setIngredientes(new String[]{"Cafe", "Huevos", "Amareto", "Azucar glas", "Queso crema", "Crema para batir", "Galletes"});
    }


}

class MousseChocolate extends Postres{

    public MousseChocolate(String nombre, String[] ingredientes) {
        super.setNombre("Musse de chocolate");
        super.setIngredientes(new String[]{"Chocolate Negro", "Huevos", "Azucar", "Crema de leche"});
    }

}

class TortaCiruelas extends Postres{

    public TortaCiruelas(String nombre, String[] ingredientes) {
        super.setNombre("Torta de ciruela");
        super.setIngredientes(new String[]{"Azucar", "Margarina", "Huevo", "Harina", "Ciruelas", "Polvo para hornear"});
    }


}