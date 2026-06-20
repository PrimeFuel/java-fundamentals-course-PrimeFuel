import java.util.Scanner;



    // ========================================
    // Clase para definir la mascota de su personaje
    // ========================================


class Mascota {

    String nombre;
    int edad;

}


public class Main {

    // ========================================
    // 👋 Método de bienvenida
    // ========================================

    public static void mostrarBienvenida() {
        System.out.println("=== CREADOR DE PERSONAJES ===");
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // ========================================
        // 🚀 Ejecuta el método
        // ========================================

        mostrarBienvenida();

        // ========================================
        // 🎮 Completa el personaje
        // ========================================

        System.out.println("Ingresa el nombre de tu personaje:");

        String nombre = scanner.nextLine();

        // ========================================
        // 📢 Mostrar resultado
        // ========================================

        System.out.println("Tu personaje se llama: " + nombre);

        Mascota mascota = new Mascota();

        // Declarar atributos a su mascota: Rellenar
        mascota.nombre = "";
        mascota.edad = ;

        System.out.println("Tu mascota se llama: " + mascota.nombre);
        System.out.println("Tu mascota tiene: " + mascota.edad + " años");


    }
}