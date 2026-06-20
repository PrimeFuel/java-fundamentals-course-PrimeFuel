class Mascota {

    private String nombre;

    public Mascota(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}

public class Main {

    public static void main(String[] args) {

        Mascota mascota = new Mascota("Luna");

        System.out.println(
            "Mi mascota se llama "
            + mascota.getNombre()
        );

    }
}

