package modelo;

import modelo.platoFuerte;

public class Carne extends platoFuerte {

    public Carne(String nombre, String[] ingredientes) {
        super(nombre, ingredientes);
    }

    public Carne() {
    }

}

class BifeChorizo extends Carne {

    public BifeChorizo() {

        super.setNombre("Bife de Chorizo");
        super.setIngredientes(new String[]{"Carne de res", "Sal", "Pimienta", "Aceite", "Hierbas"});
    }
}

class CostillasBBQ extends Carne {

    public CostillasBBQ() {

        super.setNombre("Costillas de BBQ");
        super.setIngredientes(new String[]{"Costillas de cerdo", "Salsa BBQ", "Ajo", "Miel", "Pimienta"});
    }
}

class PolloALaCordonBleu extends Carne {

    public PolloALaCordonBleu() {
        super.setNombre("Pollo a la Cordon Bleu");
        super.setIngredientes(new String[]{"Pechuga de pollo", "Jamón", "Queso", "Pan rallado", "Huevo"});
    }
}

class EstofadoDeRes extends Carne {

    public EstofadoDeRes() {
        super.setNombre("Estofado de Res");
        super.setIngredientes(new String[]{"Carne de res", "Papas", "Zanahoria", "Cebolla", "Vino tinto"});
    }
}

class ChuletaAdobada extends Carne {

    public ChuletaAdobada() {
        super.setNombre("Chuleta Adobada");
        super.setIngredientes(new String[]{"Chuleta de cerdo", "Ajo", "Achiote", "Naranja", "Especias"});
    }
}
