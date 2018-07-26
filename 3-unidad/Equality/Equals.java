class Equals{
    /*El metodo equals hace comparación de contenido y no de referencias. 
    Si una clase no implementa el metodo equal, entonces este funcionara como el operador == y evaluara 
    referencias.
    El autor de la clase StringBuilder no implemento el metodo equals, por lo tanto el metodo equals
    en este caso hara una comparación de referencias.
    */
    public static void main(String... a){
    	Equals x = new Equals();
	Equals y = new Equals();
	Equals z = x;

	System.out.println(x.equals(y));//Falso
	System.out.println(z.equals(x)); //Verdadero
    }	
}
