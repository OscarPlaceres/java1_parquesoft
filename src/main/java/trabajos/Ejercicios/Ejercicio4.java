package trabajos.Ejercicios;

import java.util.Scanner;

public class Ejercicio4 {


    public static int grados_cel (int grados){
        int grados_celsius = (grados - 32) * 5/9;
        return grados_celsius;
    }

    public static int grados_fah (int grados){
        int grados_fahr = (grados * 9/5) + 32;
        return grados_fahr;
    }

    public static void main(String[] args) {

        int grados;
        int seleccion;

        Scanner obtener = new Scanner(System.in);
        System.out.println("Ingresa la temperatura que deseas convertir: ");
        grados = obtener.nextInt();


        System.out.println(" Selecciona:\n  1. Grados Celsius a fahrenheit\n  2. Grados fahrenheit a celsius" );
        seleccion = obtener.nextInt();

        switch (seleccion){

            case 1:
                System.out.println( grados + "°C grados celsius, equivalen a: " + grados_fah(grados) + "°F grados fahrenheit.");
                break;
            case 2:
                System.out.println( grados + "°F grados fahrenheit, equivalen a: " + grados_cel(grados) + "°C grados celsius.");
                break;
            default:
                System.out.println("Opción no valida.");

        }


    }
}
