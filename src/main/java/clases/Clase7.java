package clases;

import java.util.Scanner;

public class Clase7 {
    public static void main(String[] args) {
        Scanner obtener = new Scanner(System.in);
        //EL tray lo utilizo cuando creo que puede pasar un error en el codigo devido a los humanos
        //cuando deben ingresar datos
        try {
            System.out.println("Digite un número ");
            int numero = obtener.nextInt();

        }catch (RuntimeException e){
            System.out.println(e);
        }finally {
            System.out.println("Paso por finally");
        }
    }
}
