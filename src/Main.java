
package proyectotecnicas;

import modelo.FettuccinePesto;
import modelo.PenneAlfredo;
import modelo.Lasagna;
import modelo.Ravioli;
import modelo.SpaghettiCarbonara;
import modelo.menu;
import modelo.Ensalada;
import modelo.Croquetas;
import modelo.Guacamole;
import modelo.Pincho;
import modelo.bruschetta;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import modelo.Pasta;

public class ProyectoTecnicas {

    menu menu = new menu();
    static Scanner sc;
    static int ope;
    static List<plato> orden;
    static double cont;
    static String des;
    public static void main(String[] args) {

        orden = new ArrayList<>();
        cont = 0;
        sc = new Scanner(System.in);
        int op=0;
        boolean valido = false;

        do {
            System.out.println("Menú del Restaurante:");
            System.out.println("elija la opcion que desee para empezar el bufet");
            System.out.println("1. Entradas");
            System.out.println("2. Platos fuertes");
            System.out.println("3. Postres");
            System.out.println("4. Mostrar Orden");
            System.out.println("5. Eliminar plato");
            System.out.println("6. Salir");

            while(valido == false){
                try {
                    op = Integer.parseInt(sc.nextLine());
                    valido = true;
                } catch (NumberFormatException e) {
                    valido = false;
                    System.err.println("Porfavor introdusca un valor numerico");

                }
            }

            System.out.println("holi");
            switch (op) {
                case 1:
                    System.out.println("----------entradas---------");
                    mostrarEntradas();
                    System.out.println("volvi a entradas");
                    break;
                case 2:
                    System.out.println("------plato fuerte-------");

                    System.out.println("Que opcion desea ver?");
                    System.out.println("1.Pasta");
                    System.out.println("2.Pescado");
                    System.out.println("3.Carnes");
                    int opt = Integer.parseInt(sc.nextLine());

                    if (opt==1) {
                        mostrarpasta();
                    }if (opt==2) {

                }if (opt==3) {

                }

                    break;
                case 3:
                    System.out.println("--------postres-------");
                    System.out.println("Que opcion desea ver?");
                    System.out.println("1.Postres");
                    System.out.println("2.Postres veganos");
                    System.out.println("3.Postres para Celiacos");
                    int opp = Integer.parseInt(sc.nextLine());

                    if (opp==1) {

                    }if (opp==2) {

                }if (opp==3) {

                }

                    break;
                case 4:
                    for (plato ordencli : orden) {
                        System.out.println();

                    }
                default:
                    System.out.println("opcion invalida");
            }

        } while (op != 6);

    }

    public static void mostrarEntradas() {
        boolean salir=false;

        do {
            System.out.println("Elija la opcion que desea");
            System.out.println("1. Bruschetta con Tomate y Albahaca ");
            System.out.println("2. Guacamole con totopos");
            System.out.println("3. Croquetas con Jamon");
            System.out.println("4. Pinchos de tortilla española");
            System.out.println("5. Ensalda Caprese");
            System.out.println("6. Volver al menu inicial");
            ope = Integer.parseInt(sc.nextLine());

            switch (ope) {
                case 1:
                    bruschetta un = new bruschetta();
                    un.mostrarinfo();
                    System.out.println("esta seguro de agregar "+un.getNombre()+" ?");
                    des = sc.nextLine().toLowerCase();

                    if (des.equalsIgnoreCase("si")) {
                        orden.add(un);
                        System.out.println("plato añadido");
                        System.out.println("cuantos gramos decea agregar de " + un.getNombre());
                        cont = cont + Double.parseDouble(sc.nextLine());
                    }
                    System.out.println("volviendo al menu.........");

                    break;

                case 2:

                    Guacamole uno = new Guacamole();
                    uno.mostrarinfo();
                    System.out.println("esta seguro de agrega "+uno.getNombre()+" ?");
                    des = sc.nextLine().toLowerCase();

                    if (des.equalsIgnoreCase("si")) {

                        orden.add(uno);
                        System.out.println("plato añadido");
                        System.out.println("cuantos gramos desea de " + uno.getNombre());
                        cont = cont + Double.parseDouble(sc.nextLine());

                    }
                    System.out.println("volviendo al menu.........");

                    break;

                case 3:

                    Croquetas Croquetas = new Croquetas();
                    Croquetas.mostrarinfo();
                    System.out.println("esta seguro de agregar "+Croquetas.getNombre()+" ?");
                    des= sc.nextLine().toLowerCase();
                    if(des.equalsIgnoreCase("si")){

                        System.out.println("plato añadido");
                        orden.add(Croquetas);
                        System.out.println("cuantos gramos decea de "+Croquetas.getNombre());
                        cont = cont + Double.parseDouble(sc.nextLine());

                    }else{
                        System.out.println("volviendo al menu.........");}

                    break;

                case 4:

                    Pincho pin = new Pincho();
                    pin.mostrarinfo();
                    System.out.println("Este seguuro de agregar el plato");
                    des= sc.nextLine().toLowerCase();
                    if(des.equalsIgnoreCase("si")){

                        System.out.println("plato añadido");
                        orden.add(pin);
                        System.out.println("cuantos gramos decea de "+pin.getNombre());
                        cont = cont + Double.parseDouble(sc.nextLine());

                    }
                    System.out.println("volviendo al menu.........");

                    break;
                case 5:

                    Ensalada ensa = new Ensalada();
                    ensa.mostrarinfo();
                    System.out.println("Este seguuro de agregar el plato");
                    des= sc.nextLine().toLowerCase();
                    if(des.equalsIgnoreCase("si")){

                        System.out.println("plato añadido");
                        orden.add(ensa);
                        System.out.println("cuantos gramos decea de "+ensa.getNombre());
                        cont = cont + Double.parseDouble(sc.nextLine());

                    }
                    System.out.println("volviendo al menu.........");
                    break;
                case 6://algo esta fallando en la salida
                    System.out.println("opcion 6 volviendo al menu.........");
                    salir= true;
                    break;
                default:
                    System.out.println("opcion incorrecta.Intente de nuevo");
            }


        } while (salir==false);
    }

    public static void mostrarpasta(){

        do {
            System.out.println("Elija la opcion que decea");
            System.out.println("1. Spaghetti Carbonara");
            System.out.println("2. Lasagna");
            System.out.println("3. Penne Alfredo");
            System.out.println("4. Ravioli");
            System.out.println("5. Fettuccine al Pesto");
            System.out.println("6. volver al menu principal");
            ope = Integer.parseInt(sc.nextLine());

            switch (ope) {
                case 1:
                    Pasta p =new Pasta();
                    p.FettuccinePesto();

                    uno.mostrarinfo();
                    System.out.println("Esta seguro que decea agragar esta opcion");
                    des = sc.nextLine().toLowerCase();

                    if (des.equalsIgnoreCase("si")) {

                        orden.add(uno);
                        System.out.println("plato agreagdo");
                        System.out.println("cuantos gramos decea");
                        cont += Double.parseDouble(sc.nextLine());
                    } System.out.println("volviendo al menu de pastas.....");
                    break;
                case 2:
                    Lasagna dos= new Lasagna();
                    dos.mostrarinfo();
                    System.out.println("Esta seguro de añadir esto?");
                    des= sc.nextLine().toLowerCase();

                    if (des.equalsIgnoreCase("si")) {
                        orden.add(dos);
                        System.out.println("Plato agregdo");
                        System.out.println("cuantos gramos decea?");
                        cont+= Double.parseDouble(sc.nextLine());
                    } System.out.println("volciendo al menu de pastas.....");
                    break;

                case 3:
                    PenneAlfredo tres = new PenneAlfredo();
                    tres.mostrarinfo();
                    System.out.println("Esta seguro de añadir esto?");
                    des= sc.nextLine().toLowerCase();

                    if (des.equalsIgnoreCase("si")) {
                        orden.add(tres);
                        System.out.println("Plato agregdo");
                        System.out.println("cuantos gramos decea?");
                        cont+= Double.parseDouble(sc.nextLine());
                    }System.out.println(" volviendo al menu de pastas.....");
                    break;

                case 4:
                    Ravioli cuatro= new Ravioli();
                    cuatro.mostrarinfo();
                    System.out.println("Esta seguro de añadir esto?");
                    des= sc.nextLine().toLowerCase();

                    if (des.equalsIgnoreCase("si")) {
                        orden.add(cuatro);
                        System.out.println("Plato agregdo");
                        System.out.println("cuantos gramos decea?");
                        cont+= Double.parseDouble(sc.nextLine());
                    }System.out.println("volviendo al menu de pastas.....");

                    break;

                case 5:

                    FettuccinePesto cinco = new FettuccinePesto();
                    cinco.mostrarinfo();
                    System.out.println("Esta seguro de añadir esto?");
                    des= sc.nextLine().toLowerCase();

                    if (des.equalsIgnoreCase("si")) {
                        orden.add(cinco);
                        System.out.println("Plato agregdo");
                        System.out.println("cuantos gramos decea?");
                        cont+= Double.parseDouble(sc.nextLine());
                    }System.out.println("volviendo al menu.....");
                    break;
                case 6:
                    System.out.println("Volviendo al menu principal.....");
                    break;
                default:
                    throw new AssertionError();
            }
        } while (ope!=6);
    }

    public static void mostrarcarne(){

        do {

            System.out.println("----menu de carnes----");
            System.out.println("1. Bife de Chorizo");
            System.out.println("");


        } while (ope!=6);

    }
}
