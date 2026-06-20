# 🎓 Guión — Lección 5: Fundamentos de POO y Programas Sencillos

---

## 👋 Introducción

> "¡Bienvenidos de nuevo!
>
> En la lección anterior conocimos una de las ideas más importantes de Java:
>
> la Programación Orientada a Objetos o POO.
>
> Aprendimos que una clase funciona como un plano y que un objeto es algo creado a partir de ese plano.
>
> Hoy construiremos nuestras primeras clases completas y crearemos nuestro primer programa orientado a objetos."

---

## 🏗️ Recordando qué es una clase

"Imaginemos que queremos representar mascotas dentro de un programa.

Todas las mascotas tienen características similares:

* Nombre
* Edad
* Tipo de animal

Podemos usar una clase para describirlas."

```java
public class Mascota {

    String nombre;
    int edad;
    String tipo;

}
```

"Esta clase es solamente una plantilla.

Todavía no existe ninguna mascota real."

---

## 🐶 ¿Qué es un objeto?

"Un objeto es una instancia creada a partir de una clase."

Por ejemplo:

```java
Mascota miMascota = new Mascota();
```

"Ahora sí hemos creado una mascota."

Podemos asignarle valores:

```java
miMascota.nombre = "Luna";
miMascota.edad = 3;
miMascota.tipo = "Perro";
```

---

## 🎮 Del mundo real al programa

> **Nota visual:** Mostrar ejemplos visuales de lo siguiente.

"Piensen en algunos videojuegos.

Un personaje tiene:

* Nombre
* Nivel
* Vida

Un automóvil tiene:

* Marca
* Color
* Velocidad

Una mascota tiene:

* Nombre
* Edad
* Especie

La Programación Orientada a Objetos intenta representar elementos del mundo real utilizando clases y objetos."

---

## 📦 Los atributos

"Las características que posee un objeto se llaman atributos."

Por ejemplo:

```java
String nombre;
int edad;
String especie;
```

Estos atributos almacenan información sobre cada mascota.

> **Nota visual:** Mostrar una ficha de mascota con nombre, edad y especie.

---

## ⚙️ Los métodos

"Las mascotas también pueden realizar acciones.

Para eso utilizamos métodos."

```java
public class Mascota {

    String nombre;

    public void saludar() {
        System.out.println("¡Guau!");
    }

}
```

"Ahora nuestra mascota no solo tiene información.

También puede realizar una acción."

---

## 🚀 Utilizando métodos

```java
Mascota miMascota = new Mascota();

miMascota.saludar();
```

Resultado:

```text
¡Guau!
```

"Los métodos representan comportamientos."

---

## 🐱 Construyendo una mascota completa

Veamos una versión más completa.

```java
public class Mascota {

    String nombre;
    int edad;

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

}
```

Y ahora:

```java
Mascota mascota = new Mascota();

mascota.nombre = "Luna";
mascota.edad = 3;

mascota.mostrarInformacion();
```

Resultado:

```text
Nombre: Luna
Edad: 3
```

---

## 🧠 ¿Por qué usar POO?

"Podríamos guardar toda la información en variables separadas.

Pero imaginen un programa con:

* 100 mascotas
* 500 estudiantes
* 1000 jugadores

Las variables se volverían muy difíciles de administrar y con demasiado código redundante.

La POO nos permite agrupar información y comportamientos relacionados."

---

## 🎯 Construyendo múltiples objetos

"La ventaja de las clases es que podemos crear muchos objetos."

```java
Mascota mascota1 = new Mascota();
Mascota mascota2 = new Mascota();
Mascota mascota3 = new Mascota();
```

Cada uno tendrá sus propios datos.

```java
mascota1.nombre = "Luna";
mascota2.nombre = "Max";
mascota3.nombre = "Rocky";
```

Aunque todos fueron creados usando la misma clase.

---

## 🌎 Ejemplos de POO en la vida real

"Muchísimas aplicaciones utilizan Programación Orientada a Objetos.

Por ejemplo:

* Redes sociales → Usuarios
* Videojuegos → Jugadores y enemigos
* Tiendas virtuales → Productos
* Escuelas → Estudiantes y cursos

La POO es una de las bases del desarrollo moderno de software."

---

## 🎯 Mini reto

> Completa la información de una mascota.

```java
class Mascota {

    String nombre;
    int edad;

}

public class Main {

    public static void main(String[] args) {

        Mascota mascota = new Mascota();

        // TODO:
        // Asigna un nombre
        // Asigna una edad

        System.out.println(mascota.nombre);
        System.out.println(mascota.edad);

    }
}
```

---

### ⭐ Desafío Extra

Añade un nuevo atributo:

```java
String especie;
```

Y muestra toda la información de la mascota en pantalla.

Por ejemplo:

```text
Nombre: Luna
Edad: 3
Especie: Perro
```

---

## 🏁 Cierre

"Hoy aprendimos los fundamentos de la Programación Orientada a Objetos.

✅ Qué es una clase.

✅ Qué es un objeto.

✅ Qué son los atributos.

✅ Qué son los métodos.

También construimos nuestro primer programa orientado a objetos utilizando mascotas.

En la próxima lección aprenderemos a mejorar nuestras clases utilizando constructores y encapsulación para crear programas más organizados y seguros.

¡Nos vemos en el próximo video!"
