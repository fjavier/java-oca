# Usando la clase StringBuilder.

Un pequeño codigo puede crear muchas Cadenas.
P/E

´´´
String alpha="";
for(char actual = 'a'; actual <= 'z'; actual++){
    alpha+=actual;
}
´´´

System.out.println(alpha);

Debido a que el objeto String es inmutable, este crea 27 Cadenas, en cada recorrido
la anterior cadena es elegida por el garbageCollection, esto es muy ineficiente.

Debido a esto existe la clase StringBuilder, la cual evita crear una nueva cadena ya que 
la clase StringBuilder es mutable.

StringBuilder alpha = "";
for(char actual='a'; actual<='z';actual++){
    alpha.append(actual);
}

System.out.println(alpha);

De esta manera se evita crear tantas cadenas y al objeto alpha se reutiliza y se le agrega un 
nuevo caracter por cada iteración.

## Mutabilidad y encadenamiento.

La clase StringBuilder como deciamos previamente es Mutable, en otras palabras modificable.

El encadenamiento es incluso mas interesante, cuando encadenamos llamadas de Metodos en Cadena, el resultado
es una nueva Cadena. Sin embargo con la clase StringBuilder no funciona de la misma manera, en vez de eso 
este retorna una referencia de el mismo.

Por Ejemplo:

StringBuilder sb = new StringBuilder("inicio");
sb.append("+medio"); //sb = "inicio+medio"
StringBuilder mismaReferencia = sb.append("+final");//"inicio+medio+final"

La primera linea crea un objeto StringBuilder.
La segunda linea agrega la palabra 'medio' a sb y retorna la misma referencia
La tercera linea agrega la palabra 'final' a sb, retorna la referencia y la asigna a la variable
mismaReferencia.

Esto quiere decir que sb y mismaReferencia, son iguales.


