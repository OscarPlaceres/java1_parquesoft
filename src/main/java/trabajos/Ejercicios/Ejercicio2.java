package trabajos.Ejercicios;

public class Ejercicio2 {
    //Van a crear un objeto de tipo vehiculo y va a tener 4 atributos
    // y un constructor que me cree el objeto
    // con los valores de los atributos

    public static void main(String[] args) {

        Vehiculo vehiculo = new Vehiculo("Toyota","Azul","2025",5);

        Vehiculo automovil = new Vehiculo();

        automovil.setMarca("Audi");
        automovil.setColor("Negro");

        System.out.println(automovil.getMarca());





    }
}
