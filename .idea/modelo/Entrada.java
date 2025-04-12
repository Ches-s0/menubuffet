package modelo;

/**
 *
 * @author maria
 */
public class Entrada extends menu{

    public Entrada(String nombre, String[] ingredientes) {
        super(nombre, ingredientes);
    }

    public Entrada(){}


}

class bruschetta extends Entrada{

    /*public bruschetta(String nombre, String[] ingredientes) {
        super("Bruschetta con Tomate y Albahaca", new String[]{"Rebanadas de pan tostado", " crema de ajo", "Aceite de oliva", "Toamtes", "Vinagre Valsamico"});
    }*/

    public bruschetta() {
        super.setNombre("Bruschetta con Tomate y Albahaca");
        super.setIngredientes( new String[]{"Rebanadas de pan tostado", " crema de ajo", "Aceite de oliva", "Toamtes", "Vinagre Valsamico"});
    }
}



class Guacamole extends Entrada {


   /* public Guacamole(String nombre, String[] ingredientes) {
        super("Guacamole con totopos", new String []{"Aguacate", "Cebolla", "Cilantro", "Jalapeño", "Limon"});
    }*/

    public Guacamole(){
        super.setNombre("Guacamole con totopos");
        super.setIngredientes(new String []{"Aguacate", "Cebolla", "Cilantro", "Jalapeño", "Limon"});
    }

}

class Croquetas extends Entrada{


   /* public Croquetas(String nombre, String[] ingredientes) {
        super("Croquetas con Jamon", new String[]{"Bechamel","Jamos cerrano",});
    }*/


    public Croquetas() {

        super.setNombre("Croquetas con jamon");
        super.setIngredientes(new String[]{"Bechamel","Jamos cerrano"});
    }

}

class Pincho extends Entrada{

   /* public Pincho(String nombre, String[] ingredientes) {
        super("Pinchos de tortilla española", new String[]{"Tortilla española", "Pan","Pimientos"});
    }*/

    public Pincho(){

        super.setNombre("Pinchos de tortilla española");
        super.setIngredientes(new String[]{"Tortilla española", "Pan","Pimientos"});
    }

}

class Ensalada extends Entrada{

   /* public Ensalada(String nombre, String[] ingredientes) {
        super("Ensalda Caprese", new String[]{"Tomate", "Mozzarella","Albaca", "Aceite de oliva", "Vinagre balsamico"});
    }*/

    public Ensalada(){

        super.setNombre("Ensalda Caprese");
        super.setIngredientes(new String[]{"Tomate", "Mozzarella","Albaca", "Aceite de oliva", "Vinagre balsamico"});
    }

}