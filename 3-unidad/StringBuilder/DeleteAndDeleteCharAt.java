class DeleteAndDeleteCharAt{
    /*
    El metodo Delete es lo opuesto al Insert, este remueve los caracteres que se encuentran desde la posición inicial
    hasta la posicion Final que se le pasa como parametro.
    El metodo DeleteCharAt unicamente remueve el caracter de la posición index.

    Firmas:
    StringBuilder delete(int desdeIndice, int hastaIndice)
    StringBuilder deleteCharAt(int indice)
    */
    public static void main(String... a){
         StringBuilder sb = new StringBuilder("abcdef");
	 sb.delete(1,3); //Elimina desde 'a' hasta 'd' : adef
	 sb.deleteCharAt(5); //Genera una excepción. Esta posición no existe
    }
}
