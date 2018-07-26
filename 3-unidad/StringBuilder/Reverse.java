class Reverse{
    /*
    El metodo Reverse es bastante simple, invierte los caracteres de la cadena.
    Firma:
    StringBuilder reverse(String cadena);
    */
    public static void main(String... a){
        StringBuilder sb = new StringBuilder("animals");
	sb.reverse();
	System.out.println(sb);
    }
}
