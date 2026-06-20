# 🎓 Guión — Lección 7: Arrays y Proyecto Final

---

# 👋 Introducción

> "¡Bienvenidos a la última lección práctica del curso!
>
> Hasta ahora hemos aprendido a crear programas utilizando variables, métodos, clases, objetos, constructores y encapsulación.
>
> Pero aparece una nueva pregunta:
>
> ¿Qué ocurre cuando queremos trabajar con muchas mascotas, muchos estudiantes o muchos personajes?
>
> No podemos crear una variable distinta para cada uno.
>
> Hoy aprenderemos a utilizar arrays para almacenar múltiples objetos y construiremos nuestro proyecto final."

---

# 🧠 El problema

Supongamos que queremos guardar tres mascotas.

Podríamos hacer esto:

```java
Mascota mascota1 = new Mascota("Luna", 3);

Mascota mascota2 = new Mascota("Max", 2);

Mascota mascota3 = new Mascota("Rocky", 5);
```

"Funciona.

Pero imaginen cien mascotas.

O mil estudiantes.

Son demasiados datos de los que podemos teclear

Necesitamos una mejor solución."

---

# 📦 ¿Qué es un Array?

"Un array es una estructura que nos permite almacenar varios elementos del mismo tipo."

Por ejemplo:

```java
String[] nombres = {
    "Ana",
    "Luis",
    "Carlos"
};
```

"En lugar de tener muchas variables, agrupamos todo en una sola estructura."

---

# 🔢 Accediendo a posiciones

Si nos damos cuenta, cada elemento tiene una posición ordinal.

```java
String[] nombres = {
    "Ana",
    "Luis",
    "Carlos"
};
```

| Posición | Valor  |
| -------- | ------ |
| 0        | Ana    |
| 1        | Luis   |
| 2        | Carlos |

Podemos acceder a ellos así:

```java
System.out.println(nombres[0]);
```

Resultado:

```text
Ana
```

"Siempre el primer item empieza desde 0."

---

# 🐶 Arrays de Objetos

"Lo más interesante es que los arrays también pueden almacenar objetos."

```java
Mascota[] mascotas = new Mascota[3];
```

Ahora podemos guardar varias mascotas.

```java
mascotas[0] = new Mascota("Luna", 3);

mascotas[1] = new Mascota("Max", 2);

mascotas[2] = new Mascota("Rocky", 5);
```

---

# 🔄 Recorriendo un Array

"Podemos usar un bucle de los que hemos visto en otras lecciones para recorrer todos los elementos."

```java
for (int i = 0; i < mascotas.length; i++) {

    mascotas[i].mostrarInformacion();

}
```

"Con pocas líneas mostramos todas las mascotas almacenadas."

---

# 🚀 Construyendo el Proyecto Final

"Ahora vamos a combinar todo lo aprendido durante el curso."

---

## Paso 1: Crear una clase

Por ejemplo:

```java
class Personaje {

    private String nombre;
    private String clase;

}
```

---

## Paso 2: Crear un constructor

```java
public Personaje(String nombre,
                 String clase) {

    this.nombre = nombre;
    this.clase = clase;

}
```

---

## Paso 3: Crear un método

```java
public void mostrarInformacion() {

    System.out.println(nombre);
    System.out.println(clase);

}
```

---

## Paso 4: Crear un Array

```java
Personaje[] personajes =
        new Personaje[3];
```

---

## Paso 5: Crear objetos

```java
personajes[0] =
    new Personaje(
        "Luz",
        "Bruja");

personajes[1] =
    new Personaje(
        "Eiselin",
        "Caballero");

personajes[2] =
    new Personaje(
        "Basilio",
        "Berserker");
```

---

## Paso 6: Mostrar resultados

```java
for (int i = 0;
     i < personajes.length;
     i++) {

    personajes[i]
        .mostrarInformacion();

}
```

---

# 🎨 Ideas para el Proyecto Final

Puedes elegir el tema que prefieras:

### 🐶 Registro de Mascotas

Guardar varias mascotas y mostrar su información.

### 🎮 Registro de Personajes

Guardar personajes de videojuegos, anime o películas.

### 🎓 Registro de Estudiantes

Guardar estudiantes con nombre y edad.

### ⚔️ Registro de Héroes

Guardar héroes con nombre, nivel y clase.

---

# 🎯 Mini reto

Implementa el uso de Scanner en tu programa para que puedas introducir manualmente
los atributos de tus clases desde la consola.

---

# 🏁 Cierre

"¡Felicidades!

Durante este curso aprendimos:

✅ Variables

✅ Tipos de datos

✅ Operadores

✅ Condicionales

✅ Bucles

✅ Métodos

✅ Entrada y salida de datos

✅ Clases y objetos

✅ Constructores

✅ Encapsulación

✅ Arrays

Y finalmente construimos una aplicación completa utilizando Programación Orientada a Objetos.

Este es solo el comienzo de tu camino como programador.

Sigue practicando, creando proyectos y experimentando con nuevas ideas.

¡Gracias por acompañarnos durante este curso y mucho éxito en tus próximos proyectos!"
