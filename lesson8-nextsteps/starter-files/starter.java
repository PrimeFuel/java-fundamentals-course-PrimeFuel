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

        Mascota mascota = new Mascota("Luna")

        System.out.println(
            "Mi mascota se llama "
            + mascota.getNombre()
        )

    }
}

// 📋 Tu misión
//  El programa debería mostrar:
//  Mi mascota se llama Luna
//  Pero actualmente tiene errores.

//  🔍 Encuéntralos y corrígelos.

//Si encontraste los errores, acabas de hacer algo que realizan programadores todos los días:
//leer código, identificar problemas y corregirlos.
//Sigue practicando, sigue construyendo cosas y nunca tengas miedo de equivocarte.
//Todo programador empezó exactamente igual.