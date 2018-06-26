public class OperadoresCompuestos{
	public static void main(String[] a){
		asignarOperadorCompuesto();
		mostrarUtilidadOperadorCompuesto();
		asignar();
	}

	public static void asignarOperadorCompuesto(){
		//Ejemplo de asignador compuesto:
		int x = 1;
		int y = 2;
		//Como regla general el operador compuesto debe ser previamente definido.
		 x*= y;
		System.out.println(x);
	}

	public static void mostrarUtilidadOperadorCompuesto(){
		//Una de las utilidades de la asignación con operadore compuesto es que es posible la
		//Conversión implicita en operaciones de diferente tipos:
		int x = 10;
		long y = 20l;
		x += y; //Esta linea no genera error de compilación a pesar que la operación es con diferentes tipos
		System.out.println(x);
		
		double a = 30.90;
		short b = 2;
		b += a; //El resultado se almacena en una variable de tipo short.
		System.out.println(b);
	}

	public static void asignar(){
		
		long x = 5;
		long y = (x = 3); //Asignación de valores multiples
		System.out.println("Asignación multiple con el mismo valor");
		System.out.println(x);
		System.out.println(y);
		int a = 2;
		float b = (a = 5); //Conversión implicita
		System.out.println(a);
		System.out.println(b);
	}
}
