class CharAt{
    /*El metodo CharAt obtiene el caracter que encontro en el indice que le indicamos.
    firma: 
    char charAt(int indice);
    */
    public static void main(String a[]){
	String animal = "Ballena";
	System.out.println(animal.charAt(0)); //Retorna la letra B
	System.out.println(animal.charAt(5)); //Retorna la letra n
	System.out.println(animal.charAt(animal.length() + 1)); //Genera una excepcion
    }

}

