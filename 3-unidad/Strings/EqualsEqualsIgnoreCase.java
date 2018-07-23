class EqualsEqualsIgnoreCase{

    /*
    El metodo equals revisa que ambas cadenas contengan exactamente los mismos caracteres en el mismo orden.
    El metodo equalsIgnoreCase hace lo mismo que el equals con la excepcion que no importa si son mayusculas o
    minusculas.

    Firmas:
    boolean equals(Object object);
    boolean equalsIgnoreCase(Object object);
    */
    public static void main(String... a){
    	System.out.println("abc".equals("ABC")); //falso
	System.out.println("abc".equals("abc")); //Verdadero
	System.out.println("abc".equalsIgnoreCase("ABC")); //Verdadero
    }
}
