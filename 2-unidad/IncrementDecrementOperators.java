public class IncrementDecrementOperators{
    public static void main(String[] args){
	preIncrementar();
	preDecrementar();
        postIncrementar();
	postDecrementar();
	practicaOperadoresUnarios();
    }
   
    public static void preIncrementar(){
	int i = 0;
	System.out.println("preIncrementar");
	System.out.println(i);
	//El operador unario ++, incrementa en 1 el valor original.
	System.out.println(++i); //Salida: 1
	System.out.println(i); //Salida 1
    }
   
   public static void preDecrementar(){
       int i = 0;
      //El operador unario --, decrementa en 1 el valor original 
	System.out.println("preDecrementar");
	System.out.println(i); //Salida: 0
	System.out.println(--i); //Salida: -1
	System.out.println(i); //Salida: -1
   }

    public static void postIncrementar(){
        int i = 0;
        //En este caso el incremento se realiza luego de haber hecho la operacion
	System.out.println("PostIncremento:"+i);     
        System.out.println(i++); //Salida: 0
	System.out.println(i); //Salida : 1
    }

    public static void postDecrementar(){
          int i = 0;
         //En este caso el decremento se realiza luego de haber hecho la operación
         System.out.println("postDecremento");
         System.out.println(i--); //Salida 0
         System.out.println(i); //Salida : -1
    }

    public static void practicaOperadoresUnarios(){
        //Cual es el resultado de la siguiente operacion?
        int x = 3;
        int y = ++x * 5 / x-- + --x;
	// ++x = 4 => 4*5
	// x-- = 4
	// --x = 2 =>  2
	// y = 4 * 5 / 4 + 2 => 7
	System.out.println("x es : "+x);
	System.out.println("y es : "+y);
    }
}
