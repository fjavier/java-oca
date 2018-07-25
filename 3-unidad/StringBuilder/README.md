# Usando la clase StringBuilder.

Un pequeño codigo puede crear muchas Cadenas.
P/E

```java
String alpha="";
for(char actual = 'a'; actual <= 'z'; actual++){
    alpha+=actual;
}
```

System.out.println(alpha);

Debido a que el objeto String es inmutable, este crea 27 Cadenas, en cada recorrido
la anterior cadena es elegida por el garbageCollection, esto es muy ineficiente.

Debido a esto existe la clase StringBuilder, la cual evita crear una nueva cadena ya que 
la clase StringBuilder es mutable.
```java
StringBuilder alpha = "";
for(char actual='a'; actual<='z';actual++){
    alpha.append(actual);
}
```

System.out.println(alpha);

De esta manera se evita crear tantas cadenas y al objeto alpha se reutiliza y se le agrega un 
nuevo caracter por cada iteración.

## Mutabilidad y encadenamiento.

La clase StringBuilder como deciamos previamente es Mutable, en otras palabras modificable.

El encadenamiento es incluso mas interesante, cuando encadenamos llamadas de Metodos en Cadena, el resultado
es una nueva Cadena. Sin embargo con la clase StringBuilder no funciona de la misma manera, en vez de eso 
este retorna una referencia de el mismo.

Por Ejemplo:
```java
StringBuilder sb = new StringBuilder("inicio");
sb.append("+medio"); //sb = "inicio+medio"
StringBuilder mismaReferencia = sb.append("+final");//"inicio+medio+final"
```

La primera linea crea un objeto StringBuilder.
La segunda linea agrega la palabra 'medio' a sb y retorna la misma referencia
La tercera linea agrega la palabra 'final' a sb, retorna la referencia y la asigna a la variable
mismaReferencia.

Esto quiere decir que sb y mismaReferencia, son iguales.

### Otro ejemplo:

StringBuilder a = new StringBuilder("abc");
StringBuilder b = a.append("de");
b = b.append("f").append("g");
System.out.println("a="+a);
System.out.println("b="+b);

Las variables a y b apuntan a la misma referencia, por lo tanto ambas son modificadas.
a = "abcdefg"
b = "abcdefg"

## Creando un StringBuilder

Firmas:
StringBuilder sb1 = new StringBuilder(); //StringBuilder Vacio
StringBuilder sb2 = new StringBuilder("animal"); //StringBuilder con valor animal
StringBuilder sb3 = new StringBuilder(10); //StringBuilder con un valor de caracteres reservado

Tamaño es el número de caracteres que estan actualmente en la secuencia, y Capacidad es el número
que puede mantener. Ya que una cadena es inmutable, el tamaño y la capacidad son las mismas.

Para el StringBuilder, Java sabe que el tamaño puede variar. Cuando el StringBuilder es construido, este
puede iniciar con una capacidad establecida por defecto (16) o la que el usuario pueda darle.

StringBuilder sb = new StringBuilder(5); //Capacidad = 5, tamaño = 0
sb.append("anim"); //Capacidad = 5, tamaño = 4
sb.append("als"); //Capacidad incrementa automaticamente al tamaño. tamaño = 7

## Los metodos a tomar en cuenta en el examen son los siguientes:

1. charAt
2. indexOf
3. length
4. substring

Que basicamente funcionan igual que el String.
