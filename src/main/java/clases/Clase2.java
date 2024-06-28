package clases;

import java.util.Scanner;

public class Clase2 {
    public static void main(String[] args) {

        Scanner obtener = new Scanner(System.in);
        /*
        System.out.println("Ingrese su nombre:");
        String nombre = obtener.next();
        System.out.println("Su nombre es: " + nombre);

        System.out.println("Ingrese su edad: ");
        int edad = obtener.nextInt();
        System.out.println("Su edad es: " + edad);
        */


        //CALCULADORA

        System.out.println("Ingrese el primer número: ");
        int num1 = obtener.nextInt();
        System.out.println("Ingrese el segundo número: ");
        int num2 = obtener.nextInt();

        int suma = num1 + num2;
        int resta = num1 - num2;
        int multi = num1 * num2;
        int divi = num1 / num2;

        System.out.println("El resultado de la suma de: " + num1 + " + " + num2 + " es = " + suma);
        System.out.println("El resultado de la resta de: " + num1 + " - " + num2 + " es = " + resta);
        System.out.println("El resultado de la multiplicación de: " + num1 + " * " + num2 + " es = " + multi);
        System.out.println("El resultado de la division de: " + num1 + " / " + num2 + " es = " + divi);
    }

}
