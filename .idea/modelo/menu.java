package modelo;

import java.util.Scanner;
import proyectotecnicas.plato;
import proyectotecnicas.plato;

public class menu implements plato {

    Scanner sc = new Scanner (System.in);
    private String nombre;
    private String[] ingredientes; // lista que almacena los ingredientes y al ser varios se utiliza el String



    public menu(String nombre, String[] ingredientes) {
        this.nombre = nombre;
        this.ingredientes = ingredientes;
    }

    public menu() {
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String[] getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String[] ingredientes) {
        this.ingredientes = ingredientes;
    }

    @Override
    public void mostrarinfo() {
        System.out.println("Plato: " + nombre);
        System.out.println("Ingredientes: ");
        for (String ingre : ingredientes) {
            System.out.println(" - " + ingre);


        }
    }





}





