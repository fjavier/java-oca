/*
La sentencia DO While es similiar a la sentencia While con la excepcion que este 
se ejecuta al menos una vez */
public class SentenciaDoWhile{
	static public void main(String a[]){
		estructura();
	}

	static void estructura(){
		/*do{ 
			//Cuerpo
		}while(expresionBooleana);*/
		//Ejemplo
		int x = 0;
		do{
		    x++; //Incrementa la variable x a 1
		}while(false);  //Se evalua despues de haber recorrido el bloque do
		System.out.println(x); //Salida : 1
	}


}
