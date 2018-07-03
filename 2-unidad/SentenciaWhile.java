public class SentenciaWhile{
	public static void main(String a[]){
		comerQueso(10);
	}

	public static void estructura(){
		/*
			La expresion booleana es evaluada antes de cada iteración
			Pueden haber casos en el que el ciclo termine despues de haber evaluado la expresión booleana por
			primera vez.
			while(expresionBooleana){ //Parentesis Requeridos
				//cuerpo
			} //Llaves requeridas para multiples sentencias, opcional para sentencia simple
		*/
	}

	static int espacioEnBarriga = 5;

	static public void comerQueso(int pedazosDeQueso){
		while(pedazosDeQueso > 0 && espacioEnBarriga > 0){
			pedazosDeQueso--;
			espacioEnBarriga--;
		}

		System.out.println(pedazosDeQueso +" pedazos de QUeso restantes");
	}
}
