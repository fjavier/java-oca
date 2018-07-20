class StringPool{
	/*
	Las cadenas consumen bastante memoria, ya que las cadenas son inmutables, 
	por cada una de ella se crea un nuevo objeto en memoria.
	Java tiene un metodo para aquellas cadenas que son repetitivas, y evitar 
	que se creen cadenas duplicadas, la JVM crea algo llamado StringPool
	que lo que hace es que los literales van al StringPool.

	*/
	public static void main(String a[]){
		//Por Ejemplo:
		String username="Cisco505"; //Esto va para el StringPool
		String noCandidato = new String("No Candidato"); //De esta manera los objetos no van al StringPool
	}
}
