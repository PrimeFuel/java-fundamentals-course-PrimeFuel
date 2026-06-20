# 🎓 Guión — Lección 4: Métodos, Entrada/Salida e Introducción a la POO

---

## 👋 Introducción

> "¡Bienvenidos de nuevo!
>
> Hasta ahora hemos aprendido a guardar información utilizando variables, realizar cálculos, tomar decisiones y repetir acciones.
>
> Pero imaginen que nuestro programa empieza a crecer.
>
> ¿Qué ocurre si tenemos cientos de líneas de código?
>
> ¿Cómo evitamos que se convierta en un enorme desorden con líneas que inevitablemente deberían repetirse?
>
> Hoy aprenderemos algunas herramientas que utilizan los programadores para mantener sus programas organizados y hacerlos más útiles para las personas."

---

## 🧩 ¿Qué es un método?

"Un método es un bloque de código que realiza una tarea específica.

Piensen en una receta de cocina.

Cuando una receta dice:

> Preparar la salsa.

No explica todos los pasos cada vez.

Simplemente, utiliza una tarea que ya tiene un propósito definido.

Los métodos funcionan de forma parecida."

---

## 🔨 Creando nuestro primer método

Observemos este ejemplo:

> **Nota visual:** Explicar código.

```java
public class Main {

    public static void saludar() {
        System.out.println("¡Hola!");
    }

    public static void main(String[] args) {

        saludar();

    }
}
```

"El método se llama `saludar`.

Cuando escribimos:

```java
saludar();
```

Ejecutamos todo el código que contiene, sin necesidad de escribir todo otra vez. Bastó solo esa palabra."

---

## 💡 ¿Por qué son útiles los métodos?

"Imaginemos que queremos mostrar el mismo mensaje muchas veces."

Sin métodos:

```java
System.out.println("Bienvenido");
System.out.println("Bienvenido");
System.out.println("Bienvenido");
```

Con métodos:

```java
public static void mostrarBienvenida() {
    System.out.println("Bienvenido");
}
```

Y luego:

```java
mostrarBienvenida();
mostrarBienvenida();
mostrarBienvenida();
```

"Nuestro código queda más limpio, más organizado y más fácil de modificar o de expandir."

---

## 💬 Programas que interactúan con el usuario

"Hasta ahora nuestros programas mostraban información.

Pero los programas modernos también reciben información."

Por ejemplo:

* Tu nombre al registrarte.
* Tu edad en una aplicación.
* Un mensaje que escribes en una red social.

"Para lograr esto necesitamos leer datos."

---

## ⌨️ Introducción a Scanner

"Java incluye una herramienta llamada Scanner."

Scanner nos permite capturar información proporcionada por el usuario.

Veamos un ejemplo:

> **Nota visual:** Explicar import.

```java

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cómo te llamas?");

        String nombre = scanner.nextLine();

        System.out.println("Hola " + nombre);

    }
}
```

---

## 🔍 ¿Qué está ocurriendo aquí?

"Analicemos las partes importantes."

```java
Scanner scanner = new Scanner(System.in);
```

"Crea un Scanner."

```java
String nombre = scanner.nextLine();
```

"Espera a que el usuario escriba algo."

```java
System.out.println("Hola " + nombre);
```

"Muestra el resultado utilizando la información ingresada."

---

## 🎮 Ejemplo práctico

"Imaginemos un videojuego."

```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nombre de tu personaje:");

        String personaje = scanner.nextLine();

        System.out.println("Bienvenido, " + personaje);

    }
}
```

> **Nota visual:** Mostrar cómo el usuario escribe un nombre y el programa responde.

"Ahora el programa se siente mucho más vivo porque interactúa con la persona que lo utiliza."

---

## 🏗️ Introducción a la Programación Orientada a Objetos

"Ahora veremos una pincelada de una idea muy importante de Java.

La Programación Orientada a Objetos, o simplemente POO."

"No se preocupen.

Hoy solo veremos la idea general. Dado que contiene conceptos bastante desarrollados"

---

## 📦 ¿Qué es una clase?

"Una clase funciona como un plano o plantilla.

Piensen en un molde para un pastel o los planos de una casa.

El plano describe cómo será la casa, pero todavía no es una casa real."

Veamos un ejemplo:

```java
public class Mascota {

    String nombre;
    int edad;

}
```

"Esta clase describe una mascota."

Tiene:

* Un nombre.
* Una edad.

Pero todavía no hemos creado ninguna mascota real.

Solo hemos definido el modelo con un nombre y edad. No tenemos ni qué animal es."

---

## 🐶 ¿Qué es un objeto?

"Un objeto es una instancia creada a partir de una clase."

Por ejemplo:

```java
Mascota miMascota = new Mascota();
```

"Ahora sí existe una mascota."

Podemos asignarle información:

```java
miMascota.nombre = "Luna";
miMascota.edad = 3;
```

Y acceder a esos datos:

```java
System.out.println(miMascota.nombre);
```

---

## 🌎 Objetos en la vida real

"La Programación Orientada a Objetos intenta representar elementos del mundo real.

Por ejemplo:

* Un videojuego puede tener objetos Jugador.
* Una escuela puede tener objetos Estudiante.
* Una veterinaria puede tener objetos Mascota.
* Una red social puede tener objetos Usuario."

"Cada objeto tiene características y comportamientos."

---

## 🎯 Mini reto

> Completa el método para que muestre un mensaje personalizado.

```java
public class Main {

    public static void mostrarMensaje() {

        // TODO:
        // Mostrar el mensaje:
        // "Estoy aprendiendo Java"

    }

    public static void main(String[] args) {

        mostrarMensaje();

    }
}
```

---

### ⭐ Desafío Extra

Modifica el programa para que pregunte tu nombre utilizando Scanner y luego muestre:

```text
Hola Diego
Bienvenido al curso de Java
```

---

## 🏁 Cierre

"Hoy aprendimos tres herramientas fundamentales de Java.

✅ Los métodos nos ayudan a organizar y reutilizar código.

✅ Scanner nos permite recibir información del usuario.

✅ Las clases y objetos nos permiten representar elementos del mundo real dentro de nuestros programas.

En la próxima lección construiremos nuestras primeras clases completas y comenzaremos a trabajar de forma más profunda con la Programación Orientada a Objetos.

¡Nos vemos en el próximo video!"
