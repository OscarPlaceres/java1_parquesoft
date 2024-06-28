package trabajos.Ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

    //   dados 3 numeros digitables decir cual es el mayor.
    //   hacer un algoritmo que detecte en que mes estamos segun un numero del 1 al 12

    public static void main(String[] args) {

        Scanner obtener = new Scanner(System.in);

        System.out.println("Ingrese el primer número: ");
        int num1 = obtener.nextInt();
        System.out.println("Ingrese el segundo número: ");
        int num2 = obtener.nextInt();
        System.out.println("Ingrese el tercer número: ");
        int num3 = obtener.nextInt();

        if (num1 > num2 & num1 > num3){
            System.out.println("El número " + num1 + " es el número mayor");
        }else if  (num2 > num1 & num2 > num3){
            System.out.println("El número " + num2 + " es el número mayor");

            } else {
                System.out.println("El número " + num3 + " es el número mayor");
            }
        }
    }

