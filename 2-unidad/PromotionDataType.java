public class PromotionDataType{
	static public void main(String... a){
		errorTipoDatoDebeSerLong();
		errorTipoDatoFloat();
		errorTipoDeDatoDebeSerInt();
		multipleConversion();
	}

	public static void errorTipoDatoDebeSerLong(){
		int x = 1;
		long y = 33;
		//La siguiente declaración genera un error de compilación, debido a que el resultado de tipo de Dato es long
		//int z = x + y;
		//Lo correcto seria 
		long z= x + y; 
		System.out.println(z);
	}

	public static void errorTipoDatoFloat(){
		double x = 39.21;
		//Si descomentas la siguiente linea genera un error de compilación, ya que un número de tipo flotante
		//su valor debe tener como prefijo el caracter 'f'.
		//Por defecto los números decimales son double
		//float y = 2.1;
		//Lo correcto seria:
		float y = 2.1f;
		double z = x+y;
		System.out.println(z);
	}

	public static void errorTipoDeDatoDebeSerInt(){
		short x = 1;
		short y = 2;
		//Si descomentas la siguiente linea, este generar un error de compilación, esto debidoo a que por regla 
		//general en las operaciones de Tipo short, byte son promovidos a int y el tipo de dato resultado sera 
		//Siempre el tipo al cual fue promovida la operación
		//short z = x + y;
		int z = x + y;
		System.out.println(z);
	}

	public static void multipleConversion(){
		short x = 14;
		//La siguiente linea es correcta esto debido a que un entero puede ser promocionado a float.
		float y = 13;
		double z = 30;
		//Cual sera el tipo de dato resultado de la operacion x * y / z?
		//Primeramente debemos tomar en cuenta que el tipo de datos mas pequeño es short y el mas grande es double.
		//Por regla general siempre las referencias en las operaciones son promocionados a su mayor mas cercano.
		//Por lo tanto el tipo de dato sera su mayor mas cercano, en este caso double.
		double a = x * y / z;
		System.out.println(z);		
	}
}
