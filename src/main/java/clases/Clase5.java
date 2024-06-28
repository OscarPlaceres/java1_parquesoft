package clases;

import java.util.Scanner;

public class Clase5 {
    //Arreglos
    public static void main(String[] args) {
        /*
        Los arreglos deben tener un tamaño fijo,
         ya sea dado por nosotros o por el usuario.

         Los arreglos empiezan en posicion cero o sea que si
         tengo un arreglo de 5 posiciones esta
         empieza en cero y va hasta la posicion 4.

         La propiedad length meda el numero de elementos de un arreglo

        Declaracion de arreglo de tipo entero
        int[] numeros;

        Declaracion arreglo tipo cadenas o string
        String[] nombres;

        Decalacion de un arreglo de objetos
        Persona[] personas;

        Inicializar un arreglo

        numeros = new int[5]; mi arreglo numeros es de enteros
        y va a tener 5 posiciones

        nombres = new String[3]; mi arreglo nombres es de String
        y va atener 3 posiciones

        Inicializar y asignar datos directos

        int[] numeros = {1,2,3,4,5};
        String[] nombres = {"Oscar","Tatiana","Samuel"};

         */

        /*int[] numeros = new int[10];

        numeros[0] = 2;
        numeros[1] = 21;
        numeros[2] = 12;
        numeros[3] = 32;
        numeros[4] = 23;

         */

        //Saber de cuanto es el tamaño del arreglo
        //System.out.println(numeros.length);


        float[] notas = new float[4];
        Scanner obtener = new Scanner(System.in);
        System.out.println("Ingrese la primera nota: ");
        notas[0] = obtener.nextFloat();
        System.out.println("Ingrese la segunda nota: ");
        notas[1] = obtener.nextFloat();
        System.out.println("Ingrese la tercera nota: ");
        notas[2] = obtener.nextFloat();
        System.out.println("Ingrese la cuarta nota: ");
        notas[3] = obtener.nextFloat();

        float promedio = (notas[0] + notas[1]+ notas[2]+ notas[3]) / notas.length ;
        System.out.println("El promedio de la nota es: " + promedio);

    }
}
