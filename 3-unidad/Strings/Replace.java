class Replace{
    /*El metodo Replace busca una cadena o caracter dado y la reemplaza por uno nuevo.
    Firmas:
    String replace(char caracterViejo, char caracterNuevo);
    String replace(CharSequence cadenaVieja, CharSequence cadenaNueva);
    CharSequence es una interfaz que implementan muchas clases como la String/StringBuilder.
    */
    public static void main(String args[]){
         System.out.println("abc".replace('a','A')); //Abc
	 System.out.println("abc".replace("ab","AB")); //ABc
	 System.out.println("animal".replace('a','A')); //AnimAl
    }
}
