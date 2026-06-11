# 🎓 Guión — Lección 2: Variables y Tipos de Datos

---

## 👋 Introducción

> "¡Bienvenidos de nuevo!
>
> En la lección anterior descubrimos qué es programar y conocimos Java por primera vez.
>
> Hoy aprenderemos algo fundamental:
>
> **¿Cómo guarda información un programa?**
>
> Porque si una aplicación recuerda tu nombre, tu puntuación en un videojuego o tu edad, significa que debe existir alguna forma de almacenar esos datos."

---

## 📦 ¿Qué es una variable?

"Imagina una caja con una etiqueta.

La etiqueta indica qué contiene la caja y dentro podemos guardar información.

Una variable funciona exactamente igual.

Es un espacio donde nuestro programa almacena datos para poder utilizarlos más adelante."

> **Nota visual:** Mostrar varias cajas etiquetadas:
>
> * Nombre
> * Edad
> * Puntuación
> * Nivel

"Por ejemplo, si queremos guardar la edad de un jugador podríamos escribir:"

```java
int edad = 15;
```

"Aquí estamos creando una variable llamada `edad` y guardando el valor 15."

---

## 🔢 Tipos de datos

"No toda la información es igual.

A veces queremos guardar números.

A veces texto.

A veces respuestas de sí o no.

Por eso Java utiliza diferentes tipos de datos."

---

## 🔹 Enteros (int)

"Los enteros se utilizan para números sin decimales."

```java
int vidas = 3;
int puntos = 150;
```

> **Nota visual:** Mostrar un marcador de videojuego.

"Las vidas y los puntos normalmente son números enteros."

---

## 🔹 Números decimales (double)

"Si necesitamos decimales utilizamos `double`."

```java
double altura = 1.75;
double temperatura = 24.5;
```

"Esto es útil para medidas más precisas."

---

## 🔹 Texto (String)

"Cuando queremos guardar palabras o frases usamos `String`."

```java
String nombre = "Diego";
String mascota = "Luna";
```

> **Nota visual:** Resaltar las comillas.

"Las comillas son importantes porque indican que estamos trabajando con texto."

---

## 🔹 Verdadero o falso (boolean)

"Algunas veces solo necesitamos dos posibles respuestas."

```java
boolean esEstudiante = true;
boolean tieneMascota = false;
```

"Los valores booleanos solo pueden ser:

* `true`
* `false`"

---

## 💻 Mostrando variables en pantalla

"Las variables son más útiles cuando podemos utilizarlas."

```java
public class Main {
    public static void main(String[] args) {

        String nombre = "Diego";
        int edad = 20;

        System.out.println(nombre);
        System.out.println(edad);

    }
}
```

"Al ejecutar el programa veremos la información almacenada."

---

## 🧠 ¿Por qué son importantes?

"Prácticamente todos los programas utilizan variables.

Por ejemplo:

* Instagram almacena nombres de usuario.
* Minecraft almacena inventarios.
* Spotify almacena canciones y listas de reproducción.
* Los videojuegos almacenan puntuaciones y niveles."

"Sin variables, las aplicaciones no podrían recordar nada."

---

## 🎯 Mini reto

> Modifica los valores de las variables para que contengan información sobre ti.

```java
public class Main {
    public static void main(String[] args) {

        String nombre = "Tu nombre";
        int edad = 0;

        System.out.println(nombre);
        System.out.println(edad);

    }
}
```

### ⭐ Desafío Extra

Añade una tercera variable:

```java
String videojuegoFavorito;
```

Guarda tu videojuego favorito y muéstralo en pantalla.

---

## 🏁 Cierre

"Hoy aprendimos qué son las variables y conocimos algunos de los tipos de datos más utilizados en Java:

* `int`
* `double`
* `String`
* `boolean`

Ahora ya podemos almacenar información dentro de nuestros programas.

En la próxima lección aprenderemos a trabajar con operadores, tomar decisiones y repetir acciones automáticamente utilizando condicionales y bucles.

¡Nos vemos en el próximo video!"
