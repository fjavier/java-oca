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

		System.out.println("=========");
		leerByte();
		overflowFlotante();
		operacionCharacter();
		promocionarOperacion();

	}

	static void leerByte(){ 
		byte a = 0;
		for(int i = 0; i < 256 ; i++){
		    a = (byte)i;
		    //Luego de alcanzar 127 el tipo de dato hace un overflow, lo cual es que 
		    //Despues de alcanzar su punto maximo, devuelve -128 su punto minimo ;)
		    System.out.println(a);
		}
		System.out.println(a);	
	}

	static void overflowFlotante(){
		System.out.println("==OB=======Overflow flotante=========");
		//Esta operación generara un valor Infinito :O
		float f = 3.4028235E38f * 20f;
		System.out.println(f);
	}

	static void operacionCharacter(){
		System.out.println("===========OPERACION CHARACTER=============");
		char a = 'a';
		char b = 'b';
		int c = a + b;
		System.out.println((byte)a);
	}

	static void promocionarOperacion(){
		System.out.println("=============PromocionarOperacion=========");
		int a = (byte)'a';
		float b = a;
		double n = 123.23f;
		double x = a + b + n;
		System.out.println(a+b+n);
	}
}
