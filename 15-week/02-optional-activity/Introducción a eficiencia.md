# Introducción a eficiencia

En esta semana conocerás el concepto de eficiencia en algoritmos. Comprenderás por qué no basta con que un programa funcione, sino que también debe ser capaz de ejecutarse en un tiempo razonable, especialmente cuando trabaja con grandes cantidades de datos.

# ¿Qué significa que un algoritmo sea eficiente?

Un algoritmo eficiente es aquel que resuelve un problema utilizando la menor cantidad posible de recursos.

## Definición

**Eficiencia:** medida de qué tan rápido y con cuánta memoria un algoritmo resuelve un problema.

# Tipos principales de eficiencia

## Eficiencia en tiempo

Hace referencia a cuánto tarda el algoritmo en ejecutarse.

## Eficiencia en espacio

Hace referencia a cuánta memoria utiliza el algoritmo.

En este curso se trabajará principalmente la eficiencia en tiempo.

# Tiempo de ejecución

El tiempo de ejecución depende principalmente de la cantidad de operaciones que realiza el algoritmo.

## Ejemplo simple

```java
// Búsqueda secuencial
for (int i = 0; i < n; i++) {

    if (arreglo[i] == valorBuscado) {

        return true;
    }
}
```

Si el arreglo tiene pocos elementos, el algoritmo termina rápido.  
Si tiene muchos elementos, el tiempo de búsqueda aumenta.

# Idea intuitiva de crecimiento

| Tamaño de datos | Número aproximado de operaciones |
|---|---|
| 10 elementos | Hasta 10 comparaciones |
| 100 elementos | Hasta 100 comparaciones |
| 1000 elementos | Hasta 1000 comparaciones |

Entre mayor sea la cantidad de datos, mayor será el tiempo de ejecución.

# Comparación básica entre soluciones

## Caso 1: Buscar en arreglo no ordenado

Se revisa elemento por elemento hasta encontrar el valor.

## Caso 2: Buscar en un árbol binario de búsqueda (BST)

En cada comparación se descarta una parte del árbol, reduciendo la cantidad de elementos a revisar.

Esto hace que la búsqueda sea más rápida en muchos casos.

# Introducción a la notación Big-O

En informática se utiliza la notación **Big-O** para describir cómo crece el tiempo de ejecución de un algoritmo.

## Tipos básicos

| Notación | Significado |
|---|---|
| O(n) | Crece proporcional al tamaño de los datos |
| O(log n) | Crece lentamente |
| O(n²) | Crece muy rápido |

# Ejemplos intuitivos

## O(n)

```java
for (int i = 0; i < n; i++) {

    System.out.println(i);
}
```

El ciclo se repite `n` veces.

## O(n²)

```java
for (int i = 0; i < n; i++) {

    for (int j = 0; j < n; j++) {

        System.out.println(i + " " + j);
    }
}
```

El segundo ciclo se ejecuta dentro del primero, aumentando mucho más las operaciones.

# Competencias de esta semana

| Competencia | Qué significa | Cómo lo evidencias |
|---|---|---|
| Comprender eficiencia | Saber que no solo importa que funcione | Explicas correctamente el concepto |
| Diferenciar tiempo y espacio | Reconocer ambos tipos de eficiencia | Das ejemplos |
| Comparar soluciones | Identificar cuál es más rápida | Justificas tu elección |
| Entender crecimiento | Relacionar datos con tiempo | Explicas casos prácticos |

# Actividad práctica

## Análisis de algoritmos

### Algoritmo A

```java
for (int i = 0; i < n; i++) {

    System.out.println(i);
}
```

### Algoritmo B

```java
for (int i = 0; i < n; i++) {

    for (int j = 0; j < n; j++) {

        System.out.println(i + " " + j);
    }
}
```

# Comparación

## ¿Cuál crece más rápido?

El **Algoritmo B** crece más rápido porque tiene dos ciclos anidados.

## ¿Cuál es más eficiente?

El **Algoritmo A** es más eficiente porque realiza menos operaciones.

# Explicación

- El Algoritmo A tiene complejidad aproximada **O(n)**.
- El Algoritmo B tiene complejidad aproximada **O(n²)**.

Cuando `n` aumenta, el número de operaciones del algoritmo B crece mucho más rápido que el del algoritmo A.

# Conclusión

La eficiencia es un aspecto fundamental en programación, ya que permite desarrollar soluciones rápidas y capaces de manejar grandes cantidades de información. Comprender cómo crecen los algoritmos ayuda a seleccionar la mejor solución para cada problema y optimizar el rendimiento de los programas.
