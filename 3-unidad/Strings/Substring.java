class Substring{
	/*
	El substring retorna la cadena desde un indice hasta el final de la cadena, o hasta el parametro
	opcional indiceFinal.
	Firmas:
	String substring(int indice);
	String substring(int indice, int indiceFinal);
	*/
    public static void main(String a[]){
         String string = "animales";
	 System.out.println(string.substring(3)); //Retorna 'males'
	 System.out.println(string.substring(string.indexOf('m'))); //Retorna males
	 System.out.println(string.substring(1,2)); //Retorna n
	 //No genera excepción, ya que el indice final es el tope de la cadena, es decir no incluye el 8 caracter
	 System.out.println(string.substring(3,8)); //Retorna males
	 //Genera una excepción, esto debido a que el indice final sobrepasa el tamaño de la cadena
	 System.out.println(string.substring(3,9)); 
    }	
}
