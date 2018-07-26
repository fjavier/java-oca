# Entendiendo el concepto de Igualdad.

Es de conocimiento que el operador == se utiliza para comparación de primitivos y los objetos que utilizan
la misma referencia.

StringBuilder one = new StringBuilder();
StringBuilder two = new StringBuilder();
StringBuilder three = one; 

System.out.println(one == two); //Falso
System.out.println(three == one); //Verdadero

Ya que en estos casos no estamos tratando con primitivos, sino con objetos, entonces la igualdad hace una comparación
de objetos que tienen la misma referencia.
El objeto one y el objeto two, son diferentes porque estos fueron instanciados con el operador new, dando como resultado que para cada una de ellas, se creen dos instancias diferentes. la referencia three apunta hacia el mismo objeto one, es debido a esto que al hacer la comparación da como resultado Verdadero.

## Cadenas

String x = "Hello world";
String y = "Hello world";

System.out.println(x==y); //Verdadero

Hay que recordar que las cadenas son inmutables, pero al crear dos instancias diferentes con el mismo valor, el 
pool de cadenas(StringPool) este entra en juego y si las siguientes cadenas tienen el mismo contenido, apunten 
al mismo objeto.

