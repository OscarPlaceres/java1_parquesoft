package trabajos.Ejercicios;

public class Vehiculo {

    private String marca;
    private String color;
    private String modelo;
    private int puertas;

    Vehiculo(){

    }

   Vehiculo(String marca, String color, String modelo, int puertas){
        this.marca = marca;
        this.color = color;
        this.modelo = modelo;
        this.puertas = puertas;
   }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }
}
