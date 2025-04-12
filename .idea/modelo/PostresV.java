
package modelo;

import modelo.Postre;

public class PostresV extends Postre {

    public PostresV(String nombre, String[] ingredientes) {
        super(nombre, ingredientes);
    }

    public PostresV() {
    }

}

class MousseCV extends PostresV {

    public MousseCV(String nombre, String[] ingredientes) {
        super.setNombre("Mousse de dChocolate (V)");
        super.setIngredientes(new String[]{});
    }

}

class TartaManzanaV extends PostresV {

    public TartaManzanaV(String nombre, String[] ingredientes) {
        super.setNombre("Tarta de manzana(V)");
        super.setIngredientes(new String[]{});
    }

}

class HeladoCyM extends PostresV {

    public HeladoCyM(String nombre, String[] ingredientes) {
        super.setNombre("helado de coco y mango");
        super.setIngredientes(new String[]{});
    }

}

class PannaCottaV extends PostresV {

    public PannaCottaV(String nombre, String[] ingredientes) {
        super.setNombre("Panna Cotta(V)");
        super.setIngredientes(new String[]{});
    }

}
