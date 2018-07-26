class IgualdadString{
    /*
    En el caso de las cadenas, de igual manera que con cualquier objeto el operador == 
    evalua la referencia y no el contenido.
    Pero existe el pool de cadenas, este si mira que el contenido es similar a un contenido
    definido previamente en otra cadena, entonces la nueva cadena hara referencia
    a la que ya se encuentra en el pool de cadenas.
    Es por esto que la igualdad entre saludo y saludo2 es verdadero.
    */
    public static void main(String... a){
         String saludo = "Hola mundo";
	 String saludo2 = "Hola mundo";
	 System.out.println(saludo == saludo2);//Verdadero


	 //Ejemplo 2
	 String x = "Hello world";
	 String y = " Hello world".trim();

	 System.out.println(x==y);//Falso

	 /*En este ejemplo vemos claramente que aqui rompimos con la igualdad del contenido,
	 aunque aparentemente estas dos cadenas son iguales, el metodo trim crea una nueva cadena
	 y la asigna a y. 
	 Esta nueva cadena es agreagada al pool de cadenas*/
    }	
}
