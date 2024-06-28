package trabajos.Ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        int grados_celsius = 0;
        int grados_fahr = 0;
        int grados = 0;
        int seleccion;



        Scanner obtener = new Scanner(System.in);
        System.out.println("Ingresa la temperatura que deseas convertir: ");
        grados = obtener.nextInt();

        grados_celsius = (grados - 32) * 5/9;

        grados_fahr = (grados * 9/5) + 32;

        System.out.println(" Selecciona:\n  1. Grados Celsius a fahrenheit\n  2. Grados fahrenheit a celsius" );
        seleccion = obtener.nextInt();

        switch (seleccion){

            case 1:
                System.out.println( grados + "°C grados celsius, equivalen a: " + grados_fahr + "°F grados fahrenheit");
                break;
            case 2:
                System.out.println( grados + "°F grados fahrenheit, equivalen a: " + grados_celsius + "°C grados celsius");
                break;
            default:
                System.out.println("Opción no valida");

        }


    }
}
