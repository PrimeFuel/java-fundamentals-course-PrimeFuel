import java.util.Scanner;

class Personaje {

    private String nombre;
    private String clase;
    private int nivel;

    public Personaje(String nombre, String clase, int nivel) {
        this.nombre = nombre;
        this.clase = clase;
        this.nivel = nivel;
    }

    public void mostrarInformacion() {
        System.out.println("----------------------");
        System.out.println("Nombre: " + nombre);
        System.out.println("Clase: " + clase);
        System.out.println("Nivel: " + nivel);
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Personaje[] personajes = new Personaje[10];

        int cantidadPersonajes = 0;

        int opcion = 0;

        while (opcion != 3) {

            System.out.println("\n=== REGISTRO DE PERSONAJES ===");
            System.out.println("1. Registrar personaje");
            System.out.println("2. Mostrar personajes");
            System.out.println("3. Salir");

            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            if (opcion == 1) {

                if (cantidadPersonajes >= personajes.length) {

                    System.out.println("No hay más espacio disponible.");

                } else {

                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();

                    System.out.print("Clase: ");
                    String clase = scanner.nextLine();

                    System.out.print("Nivel: ");
                    int nivel = scanner.nextInt();
                    scanner.nextLine();

                    personajes[cantidadPersonajes] =
                            new Personaje(nombre, clase, nivel);

                    cantidadPersonajes++;

                    System.out.println("Personaje registrado.");
                }

            } else if (opcion == 2) {

                if (cantidadPersonajes == 0) {

                    System.out.println("No hay personajes registrados.");

                } else {

                    System.out.println("\n=== LISTA DE PERSONAJES ===");

                    for (int i = 0; i < cantidadPersonajes; i++) {
                        personajes[i].mostrarInformacion();
                    }
                }

            } else if (opcion == 3) {

                System.out.println("Programa finalizado.");

            } else {

                System.out.println("Opción no válida.");

            }
        }

        scanner.close();
    }
}