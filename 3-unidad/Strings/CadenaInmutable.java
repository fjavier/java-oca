class CadenaInmutable{
	/*Inmutable significa que no se puede cambiar, las cadenas en Java Son inmutables
	una vez establecido su valor, este no puede ser modificado de ninguna manera.
	*/

	public static void main(String... a){
	    //Ejemplo de Inmutabilidad
	    String s1 = "1"; //Crea la cadena 1
	    String s2 = s1.concat("2"); //Concatena 1 con el valor 2, s2 = 12
	    s2.concat("3"); //Concatena 12 con el valor "3"
	    System.out.println(s2); //Al final la linea 8 no cambia el valor de s2. su salida es 12
	}	
}
