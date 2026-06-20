import java.util.Scanner;

class Personaje {

    private String nombre;
    private String clase;

    public Personaje(String nombre, String clase) {
        this.nombre = nombre;
        this.clase = clase;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Clase: " + clase);
        System.out.println("----------------------");
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Personaje[] personajes = new Personaje[3];

        System.out.println("=== REGISTRO DE PERSONAJES ===");

        // ========================================
        // 🎯 RETO
        // ========================================
        //
        // Completa el programa para:
        //
        // 1. Pedir nombre y clase
        //    para los 3 personajes.
        //
        // 2. Guardarlos en el array.
        //
        // 3. Mostrar todos los personajes.
        //
        // Usa un bucle para registrar
        // y otro para mostrar.
        //
        // ========================================

        scanner.close();
    }
}