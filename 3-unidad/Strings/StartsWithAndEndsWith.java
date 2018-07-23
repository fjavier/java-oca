class StartsWithAndEndsWith{
    /*
    El metodo startsWith revisa si la cadena comparada comienza con el Prefijo dado en el parametro
    El metodo endsWith revisa si la cadena comparada termina con el Sufijo dado en el parametro.

    Firmas:
    boolean startsWith(String prefijo);
    boolean endsWith(String sufijo);
    */
    public static void main(String... a){
    	System.out.println("abc".startsWith("A")); //Falso
	System.out.println("abc".startsWith("a")); //Verdadero.
	System.out.println("abc".endsWith("c")); //Verdadero
	System.out.println("abc".endsWith("a")); //Falso
    }	
}
