# 🎓 Guión — Lección 6: Constructores y Encapsulación

---

## 👋 Introducción

> "¡Bienvenidos de nuevo!
>
> En la lección anterior aprendimos a crear clases, atributos y objetos.
>
> Pero todavía tenemos un problema.
>
> Cuando creamos una mascota, tenemos que asignar todos sus datos manualmente.
>
> Además, cualquier parte del programa podría modificar esos datos sin ningún control.
>
> Hoy aprenderemos dos herramientas que nos ayudarán a mejorar la solidez de nuestras clases:
>
> ✅ Constructores
>
> ✅ Encapsulación"

---

## 🏗️ El problema actual

Recordemos nuestra clase Mascota.

```java
class Mascota {

    String nombre;
    int edad;

}
```

Y luego:

```java
Mascota mascota = new Mascota();

mascota.nombre = "Luna";
mascota.edad = 3;
```

"Funciona.

Pero imaginen una aplicación con cientos de mascotas.

Tendríamos que escribir estas asignaciones constantemente."

---

## ⚡ Introducción a los constructores

"Los constructores nos permiten asignar valores desde el momento en que creamos un objeto."

Veamos un ejemplo.

```java
class Mascota {

    String nombre;
    int edad;

    public Mascota(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

}
```

---

## 🔍 ¿Qué está pasando?

"El constructor tiene el mismo nombre que la clase."

```java
public Mascota(...)
```

"Y se ejecuta automáticamente cuando usamos `new`."

---

## 🚀 Creando objetos con constructores

Ahora podemos hacer esto:

```java
Mascota mascota = new Mascota("Luna", 3);
```

"En una sola línea hemos creado la mascota y asignado sus datos."

---

## 🧠 ¿Qué significa this?

"Seguramente notaron esta palabra."

```java
this.nombre = nombre;
```

"Ahora mismo es válido pensar en `this` como una forma de decir:

> Este atributo pertenece al objeto actual."

"No necesitan memorizar más detalles todavía."

---

## 🔓 El problema de los atributos públicos

Supongamos que tenemos:

```java
class Mascota {

    String nombre;
    int edad;

}
```

Entonces alguien podría hacer:

```java
mascota.edad = -50;
```

"O incluso:

```java
mascota.nombre = "";
```

"Nuestro programa aceptaría datos incorrectos y sin sentido."

---

## 🔒 ¿Qué es la encapsulación?

"La encapsulación consiste en proteger los datos de nuestros objetos."

Para ello utilizamos la palabra `private`.

```java
class Mascota {

    private String nombre;
    private int edad;

}
```

"Ahora esos atributos ya no pueden modificarse directamente desde fuera de la clase."

---

## 🚪 Getters y Setters

"Si los atributos están protegidos, ¿cómo accedemos a ellos?"

Utilizando métodos especiales.

---

### Getter

Permite obtener información.

```java
public String getNombre() {
    return nombre;
}
```

---

### Setter

Permite modificar información.

```java
public void setNombre(String nombre) {
    this.nombre = nombre;
}
```

---

## 🎮 Ejemplo completo

```java
class Mascota {

    private String nombre;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

}
```

Uso:

```java
Mascota mascota = new Mascota("Luna", 3);

System.out.println(mascota.getNombre());
```

---

## 🌎 ¿Por qué es útil?

"En programas reales necesitamos proteger los datos.

Por ejemplo:

* Un videojuego no debería permitir vida negativa.
* Un banco no debería permitir saldos imposibles.
* Una escuela no debería guardar edades incorrectas."

"La encapsulación ayuda a mantener nuestros datos consistentes."

---

## 🎯 Mini reto

Completa el constructor.

```java
class Mascota {

    String nombre;

    public Mascota(String nombre) {

        // TODO:
        // Guardar el nombre recibido

    }

}
```

---

### ⭐ Desafío Extra

Añade un atributo:

```java
private String especie;
```

Y crea su getter y setter.

---

## 🏁 Cierre

"Hoy aprendimos dos herramientas muy importantes de la Programación Orientada a Objetos.

✅ Los constructores nos ayudan a crear objetos con información inicial.

✅ La encapsulación protege nuestros datos utilizando atributos privados.

✅ Los getters y setters permiten acceder a esos datos de forma controlada.

En la próxima lección combinaremos todo lo aprendido para construir una aplicación más completa utilizando arrays y objetos.

¡Nos vemos en el próximo video!"
