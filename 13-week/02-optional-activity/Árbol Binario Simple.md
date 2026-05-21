# Árbol Binario Simple

En esta semana profundizaremos en un tipo específico de árbol: el árbol binario. Comprenderás su estructura, cómo se organiza y cuáles son sus características principales.

# ¿Qué es un árbol binario?

Un árbol binario es un tipo especial de árbol donde cada nodo puede tener como máximo dos hijos: uno izquierdo y uno derecho.

## Representación visual

```text
        A
       / \
      B   C
     /     \
    D       E
```

### Explicación del ejemplo

- **A** es la raíz.
- **B** es hijo izquierdo de A.
- **C** es hijo derecho de A.
- **D** es hijo izquierdo de B.
- **E** es hijo derecho de C.

Cada nodo tiene máximo dos hijos.

# Estructura interna de un nodo binario

Un nodo en un árbol binario contiene:

- Un dato
- Referencia al hijo izquierdo
- Referencia al hijo derecho

## Estructura conceptual

```text
Nodo:
    dato
    izquierdo
    derecho
```

Si un nodo no tiene hijo izquierdo o derecho, esa referencia es `null`.

# Propiedades básicas de un árbol binario

## Nodos hoja

Son los nodos que no tienen hijos.

## Altura del árbol

Es el número de niveles desde la raíz hasta el nodo más profundo.

## Subárbol izquierdo y derecho

Cada nodo puede ser considerado raíz de su propio subárbol.

# Comparación con árbol general

| Aspecto | Árbol general | Árbol binario |
|---|---|---|
| Número de hijos | Ilimitado | Máximo 2 |
| Organización | Jerárquica | Jerárquica y limitada |
| Uso común | Estructuras organizacionales | Búsquedas y recorridos |

# ¿Dónde se usan los árboles binarios?

- Estructuras de búsqueda.
- Organización de datos jerárquicos.
- Compiladores.
- Algoritmos de ordenamiento.

# Competencias de esta semana

| Competencia | Qué significa | Cómo lo evidencias |
|---|---|---|
| Comprender estructura binaria | Máximo dos hijos por nodo | Explicas correctamente el concepto |
| Identificar elementos | Raíz, hoja, subárbol | Nombras correctamente en ejemplos |
| Diferenciar árbol general | Reconocer límite de hijos | Comparas adecuadamente |
| Visualizar estructura | Dibujar árboles binarios simples | Representas correctamente |

# Actividad práctica

## Contexto

Dibuja un árbol binario que represente las siguientes letras:

`M, F, T, A, H, R, Z`

Ubica cada nodo respetando que cada uno tenga máximo dos hijos.

## Ejemplo de organización

```text
            M
          /   \
         F     T
        / \   / \
       A   H R   Z
```

# Identificación de elementos

- **Raíz:** M
- **Hojas:** A, H, R y Z
- **Nodos internos:** F y T
- **Altura del árbol:** 3 niveles

# Conclusión

Los árboles binarios son estructuras jerárquicas muy importantes en programación y estructuras de datos. Su principal característica es que cada nodo puede tener máximo dos hijos. Comprender conceptos como raíz, hoja, altura y subárbol permite interpretar mejor la organización de los datos y facilita la implementación de algoritmos de búsqueda y recorrido.
