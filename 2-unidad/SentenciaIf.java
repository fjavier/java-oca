public class SentenciaIf{
	public static void main(String... args){
		boolean a ;
		int x;
		//Es posible hacer la asignación de variable booleana como argumento de la sentencia IF
		if(a=true || false || a == true ){
			System.out.println("HOla");
		}

		//Sentencia If engañosa
		if(false)
			if(true)
				System.out.println("Sentencia");
		else{ //Esta sentencia else pertenece al segundo if, por ende  nunca llega hasta aqui
			System.out.println("Block");
		}
	}
}

