class Trim{
    //El metodo Trim elimina los espacios en blancos al inicio y al final de una cadena.
    //Estos espacios incluyen \r(Retorno de carro) \t(Tabs) \n(Nueva Linea)
    public static void main(String a[]){
	System.out.println("abc".trim()); //Retorna abc, ya que no contiene espacios en blanco
	System.out.println("\t    a b c \n".trim()); //Retorna a b c. No se eliminan los espacios en el medio.
    }
}
