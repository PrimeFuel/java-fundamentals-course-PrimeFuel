public class Main {
    public static void main(String[] args) {

        // 🎮 Cambia estos valores
        int puntos = 120;
        int monedas = 30;

        // 🧮 Calcula el total
        int total = puntos + monedas;

        System.out.println("Total: " + total);

        // 🤔 ¿Desbloqueaste el premio?
        if (total >= 150) {
            System.out.println("🏆 Premio desbloqueado");
        } else {
            System.out.println("🔒 ¡Aún no!");
        }

        // 🔄 Cuenta regresiva
        for (int i = 5; i >= 1; i--) {
            System.out.println(i);
        }

    }
}