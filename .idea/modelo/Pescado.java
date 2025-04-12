package modelo;

import modelo.platoFuerte;

public class Pescado extends platoFuerte {

    public Pescado(String nombre, String[] ingredientes) {
        super(nombre, ingredientes);
    }

    public Pescado() {
    }

}

class SalmonALaPlancha extends Pescado {

    public SalmonALaPlancha() {
        super.setNombre("Salmón a la Plancha");
        super.setIngredientes(new String[]{"Salmón", "Aceite de oliva", "Limón", "Ajo", "Perejil"});
    }
}

class Ceviche extends Pescado {

    public Ceviche() {
        super.setNombre("Ceviche");
        super.setIngredientes(new String[]{"Pescado blanco", "Cebolla morada", "Limón", "Cilantro", "Ají"});
    }
}

class PescadoFrito extends Pescado {

    public PescadoFrito() {
        super.setNombre("Pescado Frito");
        super.setIngredientes(new String[]{"Pescado entero", "Harina", "Aceite", "Sal", "Pimienta"});
    }
}

class BacalaoEnSalsaVerde extends Pescado {

    public BacalaoEnSalsaVerde() {
        super.setNombre("Bacalao en Salsa Verde");
        super.setIngredientes(new String[]{"Bacalao", "Ajo", "Perejil", "Caldo de pescado", "Vino blanco"});
    }
}

class TruchaAlHorno extends Pescado {

    public TruchaAlHorno() {
        super.setNombre("Trucha al Horno");
        super.setIngredientes(new String[]{"Trucha", "Limón", "Aceite", "Romero", "Ajo"});
    }
}
