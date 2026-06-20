class Mascota {

    String nombre;
    int edad;
    String especie;

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Especie: " + especie);
    }

     public void saludar() {
            System.out.println("¡Soy " + nombre + "!");
     }
}

public class Main {

    public static void main(String[] args) {

        Mascota mascota = new Mascota();

        mascota.nombre = "Luna";
        mascota.edad = 3;
        mascota.especie = "Perro";

        mascota.mostrarInformacion();
        mascota.saludar();
    }
}