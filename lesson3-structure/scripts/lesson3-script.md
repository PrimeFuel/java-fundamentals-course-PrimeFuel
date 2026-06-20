# 🎓 Guión — Lección 3: Operadores y Estructuras de Control

---

## 👋 Introducción

> "¡Bienvenidos de nuevo!
>
> En la lección anterior aprendimos a guardar información utilizando variables.
>
> Pero ahora surge una pregunta:
>
> **¿Qué podemos hacer con esos datos?**
>
> Porque almacenar información es útil, pero los programas también necesitan calcular, tomar decisiones y repetir acciones automáticamente.
>
> Hoy aprenderemos exactamente cómo hacerlo."

---

## 🧮 Operadores: realizando cálculos

"Los operadores permiten trabajar con números y valores.

Son similares a los símbolos matemáticos que ya conocemos."

```java
int monedas = 10 + 5;
int daño = 20 - 8;
int puntos = 10 * 2;
int vidasExtra = 20 / 4;
```

> **Nota visual:** Mostrar resultados de cada operación.

"Estos operadores nos permiten sumar, restar, multiplicar y dividir."

| Operador | Función        |
| -------- | -------------- |
| +        | Suma           |
| -        | Resta          |
| *        | Multiplicación |
| /        | División       |

"Por supuesto que existen operadores más complejos, pero requerirían importaciones de otras funciones

o en otros casos, declararlas uno mismo con más código, pero esto es todo lo que necesitamos hasta el momento,

ya que estos cuatro operadores ya son nativos de cualquier compilador."

---

## 🎮 Comparando valores

"Muchas veces un programa necesita comparar información.

Por ejemplo:

* ¿Tiene suficientes puntos?
* ¿Superó el nivel?
* ¿Es mayor de cierta edad?"

Para eso usamos operadores de comparación.

```java
int nivel = 15;

nivel > 10
```

"Esta expresión pregunta:

> ¿El nivel es mayor que 10?

La respuesta siempre será verdadera o falsa."

---

## 🤔 Tomando decisiones con if

"Ahora que podemos comparar valores, podemos tomar decisiones."

> **Nota visual:** Describir qué hace cada línea.

```java
int puntos = 120;

if (puntos > 100) {
    System.out.println("¡Nivel completado!");
}
```

> **Nota visual:** Mostrar un videojuego desbloqueando una recompensa.

"Si la condición es verdadera, el código dentro de las llaves se ejecuta."

---

## 🚦 ¿Y si ocurre otra cosa? (else)

"Muchas veces queremos dos posibles caminos."

> **Nota visual:** Describir qué hace cada línea.

```java
int puntos = 80;

if (puntos >= 100) {
    System.out.println("¡Ganaste!");
} else {
    System.out.println("Sigue intentando");
}
```

"El programa elige automáticamente qué mensaje mostrar, tanto si llegaste a una meta como si no.

En el caso anterior, el programa solo seguirá su flujo natural. Aquí, el flujo se parte a la mitad 

y toma la decisión."

---

## 🔄 Repetir acciones con for

"Imagina que queremos mostrar un mensaje cinco veces."

Podríamos escribir:

```java
System.out.println("Hola");
System.out.println("Hola");
System.out.println("Hola");
System.out.println("Hola");
System.out.println("Hola");
```

"Pero eso sería muy repetitivo y te llenarías de código innecesario y pesado."

"Para eso existen los bucles."

```java

> **Nota visual:** Explicar a detalle cada parámetro.

for (int i = 0; i < 5; i++) {
    System.out.println("Hola");
}
```

"El bucle `for` repite una acción un número específico de veces."

---

## 🔁 Repetir mientras se cumpla una condición (while)

"A veces no sabemos exactamente cuántas veces queremos repetir algo."

"En esos casos usamos `while`."

```java
int energia = 3;

while (energia > 0) {
    System.out.println("Corriendo...");
    energia--;
}
```

> **Nota visual:** Mostrar una barra de energía disminuyendo.

"El bucle continuará ejecutándose mientras la condición sea verdadera."

---

## 🧠 ¿Dónde se usan estas herramientas?

"Prácticamente en todos los programas.

Por ejemplo:

* Los videojuegos `calculan` puntuaciones.
* Las aplicaciones `deciden` qué mostrar según tus acciones.
* Las redes sociales `repiten` procesos constantemente.
* Los sistemas `utilizan condiciones` para validar información."

"Los operadores y estructuras de control son una parte fundamental de la programación."

---

## 🎯 Mini reto

> Completa el programa para que muestre un mensaje si el jugador tiene suficientes puntos.

```java
public class Main {
    public static void main(String[] args) {

        int puntos = 120;

        // TODO:
        // Si puntos es mayor o igual a 100
        // mostrar "¡Nivel completado!"

    }
}
```

### ⭐ Desafío Extra

Modifica el programa para que utilice un bucle `for` y muestre:

```text
Nivel 1
Nivel 2
Nivel 3
Nivel 4
Nivel 5
```

---

## 🏁 Cierre

"Hoy aprendimos a realizar cálculos utilizando operadores, tomar decisiones con `if` y `else`, y repetir acciones mediante los bucles `for` y `while`.

Ahora nuestros programas pueden reaccionar a situaciones y automatizar tareas.

En la próxima lección aprenderemos a organizar mejor nuestro código utilizando métodos y descubriremos cómo recibir información del usuario.

¡Nos vemos en el próximo video!"
