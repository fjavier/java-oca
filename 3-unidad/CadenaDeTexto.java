public class CadenaDeTexto{
	//Las cadenas son objetos inmutables, esto quiere decir que una vez creado no se pueden
	//Modificar
	public static void main(String... a){
		cadenasInmutables();	
		poolDeCadenas();
		obtenerCaracter();
	}	

	public static void cadenasInmutables(){
		String cadenaA = "Perro"; 
		System.out.println(cadenaA);
		String cadenaB = "Gato";
		System.out.println(cadenaB);
		cadenaA = cadenaB; //Ya no hay referencia a la cadena Perro, preparada para garbage collection
		System.out.println(cadenaA);

	}

	public static void poolDeCadenas(){
		String cadena1 = "Hola Mundo";
		String cadena2 = "Hola Mundo";
		//La primera cadena es ingresada al pool de strings 
		//La segunda cadena busca coincidencias en el pool y devuelve la referencia
		//Es por ello que al hacer la comparación encuentra que las referencias son iguales
		System.out.println(cadena1==cadena2); //True
		//Al hacer el new String obliga al compilador a agregarlo en el HEAP y no en el pool
		//Se crea una nueva referencia es por esto que al hacer la comparación entre referencias 
		//Da como resultado false
		String cadena3 = new String("Hola Mundo");
		String cadena4 = new String("Hola Mundo");
		System.out.println(cadena1==cadena3); //False
		System.out.println(cadena3==cadena4); //False
	}

	public static void obtenerCaracter(){
		String nombrePerro = "Hawkeye";
		System.out.println(nombrePerro.charAt(6));//Encuentra el caracter encontrado en la posicion 6
		//System.out.println(nombrePerro.charAt(10)); //Genera una Excepción ya que no existe ningun caracter
		char letraEncontrada = nombrePerro.charAt(5);
		System.out.println(letraEncontrada);
	}
}
