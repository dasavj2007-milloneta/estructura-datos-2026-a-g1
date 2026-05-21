# Introducción a Árboles

Los árboles son estructuras de datos no lineales que permiten organizar información de manera jerárquica. A diferencia de las estructuras lineales, donde los elementos se encuentran uno después del otro, en los árboles los datos se conectan mediante relaciones de padre e hijo, formando ramificaciones.

## ¿Qué es un árbol?

Un árbol es una estructura compuesta por nodos conectados entre sí, donde existe un nodo principal llamado raíz y los demás se organizan en niveles.

## Ejemplo básico de árbol

```text
        A
       / \
      B   C
     / \
    D   E
```

### Identificación de elementos

- **Raíz:** A  
- **Hijos de A:** B y C  
- **Padre de D y E:** B  
- **Hojas:** C, D y E  
- **Nivel:** posición de cada nodo respecto a la raíz  
- **Altura:** cantidad máxima de niveles del árbol  

## Terminología básica

| Término | Definición |
|---|---|
| Raíz | Nodo principal del árbol |
| Nodo | Cada elemento del árbol |
| Hijo | Nodo que depende directamente de otro |
| Padre | Nodo que tiene uno o más hijos |
| Hoja | Nodo que no tiene hijos |
| Nivel | Distancia desde la raíz |
| Altura | Número máximo de niveles |

## Diferencia entre árboles y estructuras lineales

| Aspecto | Estructuras lineales | Árbol |
|---|---|---|
| Forma | Secuencial | Jerárquica |
| Relación | Uno después del otro | Padre – hijos |
| Organización | Horizontal | Vertical y ramificada |
| Ejemplo | Fila de personas | Árbol genealógico |

## Ejemplo aplicado

```text
        Universidad
             |
         Facultad
             |
         Programa
             |
         Estudiante
```

### Explicación

- **Universidad** es la raíz.
- **Facultad** depende de Universidad.
- **Programa** depende de Facultad.
- **Estudiante** pertenece a un Programa.

## Actividad práctica

Diseñar un árbol organizacional de una empresa con:
- Un gerente general.
- Dos departamentos.
- Dos empleados por departamento.

### Ejemplo

```text
                 Gerente General
                 /              \
          Ventas                Sistemas
          /    \                /      \
      Ana      Luis        Carlos     María
```

### Elementos identificados

- **Raíz:** Gerente General  
- **Nodos internos:** Ventas y Sistemas  
- **Hojas:** Ana, Luis, Carlos y María  
- **Altura del árbol:** 3 niveles  

# Conclusión

Los árboles son estructuras fundamentales para representar información jerárquica. Comprender conceptos como raíz, nodo, hoja y altura permite interpretar mejor sistemas organizados por niveles. Además, diferenciar un árbol de una estructura lineal ayuda a elegir la estructura adecuada según el tipo de problema o información que se desea modelar.
