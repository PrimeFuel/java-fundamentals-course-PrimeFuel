class Mascota {

    private String nombre;
    private int edad;

    // ========================================
    // 🏗️ Constructor
    // ========================================

    public Mascota(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // ========================================
    // 🔒 Getter y Setter
    // ========================================

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}

public class Main {

    public static void main(String[] args) {

        // ========================================
        // 🎯 RETO
        // ========================================

        // 1. Crea tu mascota llamada "Luna"
        //    con edad 3

        // 2. Cambia su nombre a otro nombre
        //    usando setNombre() y su edad
        //    usando setEdad()

        // 3. Muestra el nombre usando getNombre()

        // 4. Muestra la edad usando getEdad()

    }
}