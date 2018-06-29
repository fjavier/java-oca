
public class EjercicioConversionTipoDato{
	public static void main(String... args){
		//Para el siguiente  codigo, cual de los siguientes metodos son validos?
		long x = 10;
		opcionA(x);
		opcionB(x);
		opcionC(x);
		opcionD(x);
	
	}

	public static void opcionA(long x){
		int y = 2 * (int)x;
		System.out.println(y);
	}

	public static void opcionB(long x){
		int y = 2 * (short)x;
		System.out.println(y);
	}
	
	public static void opcionC(long x){
		int y = (int) (2 * x);
	}

	public static void opcionD(long x){
		long y = 2 *  x;
	}
	
	
}
