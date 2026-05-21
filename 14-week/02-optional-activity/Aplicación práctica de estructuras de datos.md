# Aplicación práctica de estructuras de datos

En esta semana aplicarás las estructuras de datos vistas durante el curso en un escenario práctico. El objetivo es aprender a diseñar soluciones utilizando estructuras adecuadas según el tipo de información y las operaciones requeridas.

# Enfoque de la aplicación práctica

En un sistema real, las estructuras de datos no se usan de forma aislada. Generalmente, se combinan para resolver problemas concretos de gestión y organización de información.

## Definición

Una aplicación práctica consiste en utilizar estructuras de datos para resolver un problema real, considerando el tipo de datos y las operaciones necesarias.

El enfoque principal no es escribir mucho código, sino analizar la solución y justificar la elección de cada estructura.

# Escenario aplicado

Supón que estás desarrollando un sistema sencillo de gestión que maneja información de forma dinámica.

## Requerimientos generales

- Registrar elementos o datos.
- Consultar información almacenada.
- Gestionar acciones recientes.
- Procesar información en orden.

Para cumplir estos requerimientos, es necesario seleccionar correctamente las estructuras de datos.

# Diseño de la solución con estructuras de datos

## Selección de estructuras

| Necesidad | Estructura | Justificación |
|---|---|---|
| Lista principal de datos | Lista enlazada | Permite crecer y reducir dinámicamente |
| Historial de acciones | Pila | La última acción es la primera en deshacerse |
| Procesamiento por turnos | Cola | Se respeta el orden de llegada |
| Estructura jerárquica | Árbol binario | Representa relaciones padre-hijo |

# Idea conceptual en Java

```java
import java.util.*;

public class SistemaGestion {

    public static void main(String[] args) {

        List<String> elementos = new ArrayList<>();

        Stack<String> historial = new Stack<>();

        Queue<String> colaProcesos = new LinkedList<>();

        elementos.add("Elemento 1");

        historial.push("Agregar Elemento 1");

        colaProcesos.add("Proceso A");

        System.out.println("Lista: " + elementos);

        System.out.println("Historial: " + historial);

        System.out.println("Cola: " + colaProcesos);
    }
}
```

Este ejemplo muestra cómo varias estructuras de datos pueden coexistir dentro de un mismo programa para cumplir funciones diferentes.

# Explicación del código

## Lista (`ArrayList`)

```java
List<String> elementos = new ArrayList<>();
```

Se utiliza para almacenar datos principales del sistema.  
Permite agregar, eliminar y consultar elementos fácilmente.

## Pila (`Stack`)

```java
Stack<String> historial = new Stack<>();
```

Se usa para guardar acciones recientes.  
Funciona bajo el principio **LIFO** (Last In, First Out).

La última acción agregada será la primera en eliminarse.

## Cola (`Queue`)

```java
Queue<String> colaProcesos = new LinkedList<>();
```

Se usa para manejar procesos o turnos en orden de llegada.  
Funciona bajo el principio **FIFO** (First In, First Out).

# Actividad práctica

## Contexto

Imagina que debes diseñar un pequeño sistema que utilice varias estructuras de datos para gestionar información.

# Ejemplo guía

## Sistema: Gestor de eventos

### Tipos de información y estructuras

| Información | Estructura | Justificación |
|---|---|---|
| Eventos registrados | Lista enlazada | Permite agregar y eliminar eventos dinámicamente |
| Historial de acciones | Pila | Permite deshacer acciones recientes |
| Turnos de usuarios | Cola | Mantiene el orden de atención |
| Categorías de eventos | Árbol binario | Organiza información jerárquicamente |

# Interacción entre estructuras

- La lista enlazada almacena los eventos principales.
- La pila registra acciones como agregar o eliminar eventos.
- La cola organiza usuarios esperando atención.
- El árbol binario clasifica los eventos por categorías.

# Conclusión

Las estructuras de datos permiten organizar y gestionar información de manera eficiente según las necesidades del sistema. Comprender cuándo utilizar listas, pilas, colas y árboles facilita el diseño de soluciones prácticas y mejora el rendimiento de las aplicaciones.
