# Arreglos

Las clases String y StringBuilder son realmente un arreglo de secuencia de caracteres; un arreglo es un area en memoria reservado para un número designado de elementos. La clase String implementa un arreglo de caracteres con metodos pensados para tratar con estos especificamente, mientras que el StringBuilder es implementado como un arreglo donde este es
reemplazado por uno mas grande, cuando este se queda sin espacio. 

Si no queremos utilizar String, bien podemos hacerlo de esta manera:
```java
char[] letras;
```
Este metodo no es nada conveniente, debido a que perdemos todos los metodos para poder tratar con la cadena. esto es para propositos demostrativos.

Cabe destacar que la referencia letras no es de tipo primitivo, sino de tipo arreglo. char es un primitivo, es un char el tipo que acepta el arreglo y no el tipo del arreglo en si.

En otras palabras un arreglo es una lista ordenada. puede contener duplicados.

## Creando un arreglo de primitivos
```
int[] numeros = new int[3];
```

Esta es la estructura basica del arreglo:
1. int[] indica que es un arreglo que contendra datos primitivos de tipo int
2. Los [] indican que se trata de un arreglo.
3. new int inicializar el arreglo.
4. [3] indica el tamaño del arreglo

Ya que el arreglo es de tipo int, y su valor por defecto es 0, entonces inicialmente cada uno de los elementos tendra
un valor igual a 0

Existen varias maneras de crear un nuevo arreglo:

```java
int[] numAnimals;
int [] numAnimals2; //con el  [] separado del tipo
int numAnimals3[]; //EL [] seguido despues de la variable
int numAnimals4 []; //El [] seguido de un espacio despues de la variable
```
Todos estos enfoques son validos.
