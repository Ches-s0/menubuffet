import modelo.platoFuerte;

public class Pasta extends platoFuerte {

    public Pasta(String nombre, String[] ingredientes) {
        super(nombre, ingredientes);
    }

    public Pasta() {
    }
    public void SpaghettiCarbonara() {

        super.setNombre("Spaghetti Carbonara");
        super.setIngredientes(new String[]{"Pasta", "Huevo", "Panceta", "Queso", "Pimienta"});

    }

    public void Lasagna() {


        super.setNombre("Lasagna");
        super.setIngredientes(new String[]{"Pasta", "Carne Molida", "Tomate", "Queso", "Bechamel"});

    }

    public void PenneAlfredo (){

        super.setNombre("Penne Alfredo");
        super.setIngredientes(new String[]{"Pasta", "Crema", "Queso Parmesano", "Mantequilla", "Ajo"});

    }

    public void Ravioli (){

        super.setNombre("Ravioli");
        super.setIngredientes(new String[]{"Pasta", "Ricotta", "Espinaca", "Salsa de tomate", "Queso"});

    }

    public void FettuccinePesto (){


        super.setNombre("Fettuccine al Pesto");
        super.setIngredientes(new String[]{"Pasta", "Albahaca", "Ajo", "Parmesano", "Aceite de oliva"});

    }

}
