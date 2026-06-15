import java.util.Scanner;


class Mascota {

    String nombre;
    int edad;

}


public class Main {

    public static void mostrarBienvenida() {
        System.out.println("=== CREADOR DE PERSONAJES ===");
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        mostrarBienvenida();

        System.out.println("Ingresa el nombre de tu personaje:"); //Ingresa John Doe

        String nombre = scanner.nextLine();

        System.out.println("Tu personaje se llama: " + nombre);

        Mascota mascota = new Mascota();

        mascota.nombre = "King Arthur";
        mascota.edad = 200;

        System.out.println("Tu mascota se llama: " + mascota.nombre);
        System.out.println("Tu mascota tiene: " + mascota.edad + " años");


    }
}