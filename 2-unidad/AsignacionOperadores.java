public class AsignacionOperadores{
    public static void main(String... a){
	conversionAsignacionLiterales();
    }
    
    public static void conversionAsignacionLiterales(){
         //La asignación de variables es una operacion binaria.
	//Ya hemos visto que las variables tienen una conversión de tipo implicita
	//al realizar operaciones aritmeticas con diferentes tipos.
	//Pero ¿que pasa cuando hacemos asignaciones de variables con valores mayor al tipo de datos
	//Permitido por la referencia?
	//Por ejemplo: si descomentamos las siguientes sentencia obtenemos un error de compilacion.
	//int a = 1.0; //Esto es porque estamos intentando asignar un valor double al int.
	//short y = 19212222; //Estamos intentando asignar un valor int a un short.
	//int z = 9f; //Estamos intentando asignar un valor flotante a un entero
	//long b = 1923912313123123123123123123123; //El compilador cree que es un valor entero
	//Para corregir esto, debemos hacer una conversión explicita de datos.
	int a =(int) 1.0;
	short y = (short) 19212222;
	int z = (int) 9f;
        long t = 192301398193810323L;
	System.out.println(y);
	System.out.println(t);
    }

    public static void operacionAritmeticaConversionExplicita(){
          short x = 12;
          short y = 3;
          //Por regla general la operación genera un tipo de dato int. por ende lanza un error en la compilación
         // short z = x + y; 
         //Para corregir la operación, si realmente queremos que la salida sea un short
         short z = (short) (x + y);
    }
}
	
