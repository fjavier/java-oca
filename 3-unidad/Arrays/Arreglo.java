class Arreglo{
    /*
    Creación de arreglo.
    */
    public static void main(String... a){
	//Cada uno de los elementos sera igual a 0, ya que no estamos especificando los valores
        int[] numerosEnteros = new int[3];
	for(int i : numerosEnteros){
	    System.out.println(i);
	}

	//Instanciando arreglo con valores por defecto
	int[] numeros = new int[]{1,2,3};

	for(int i: numeros){
	    System.out.println(i);
	}

	//Java reconoce que la anterior forma de instanciar es redundante, esta nueva forma es llamada arreglo anonimo
	int[] arregloNumeros = {4,5,6};
	for(int i: arregloNumeros){
	    System.out.println(i);
	}


    }	
}
