public class EjercicioTipoDato{
	public static void main(String[] a){
		//En el siguiente ejercio vemos como el resultado de la 
		//Operacion aritmetica entre bytes puede ser promovido a 
		//int, long, double
		byte x= 5;
		byte y = 10;
		int z = x + y;
		long n = x + y;
		double c = x + y;
		float f = x+ y;
		System.out.println(z);
		System.out.println(n);
		System.out.println(c);
		System.out.println(f);
	}
}
