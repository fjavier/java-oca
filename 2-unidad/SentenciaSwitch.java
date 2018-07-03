/*
* La sentencia Switch en Java es una estructura de decisión compleja en el cual 
* un simple valor es evaluado y el flujo lo redirije a la primera rama que coincide conocido como CASE
* Si no se encuentra ninguna coincidencia, este  se redirije a la sentencia por defecto llamada default,
* Si esta no existe, se omite toda la sentencia.

*/
public class SentenciaSwitch{
	public static void main(String... a){
		imprimirDiasDeSemana();
		sentenciaSwitchSinBreak();
	}

	public void ejemploSentenciaSwitch(){
		/*
		*Tipos de Datos Soportados.
		* int, Integer
		* byte, Byte
		* short, Short
		* char, Character
		* String
		* enum values
		*/
		/*switch(variableToTest){ <--- Parentesis requeridos
			case constantExpresion1: 
				branch for case;
				break; <-- Opcional
			case constantExpresion2:
				branch for case2;
				break
			default:
				branch para default.
		*/
		
	}

	public static void imprimirDiasDeSemana(){
		int diaDeSemana = 5;
		final int domingo = 0;
		final int martes = 2; //Sin el modificador final, la sentencia falla
		switch(diaDeSemana){
			default:
				System.out.println("NO encontrado");
				break; //Si la sentencia break no es encontrada, esta pasa por todos los casos.
			case domingo:
				System.out.println("Domingo");
				break;
			case 1:
				System.out.println("Lunes");
				break;
			case martes:
				System.out.println("Martes");
				break;
			case (short) 3: //Sentencia Valida
				System.out.println("Miercoles");
				break;
			case (byte) 4: //Sentencia Valida
				System.out.println("Jueves");
				break;
			case 5:
				System.out.println("Hoy es viernes");
				break;
		}
	}
	
	public static void sentenciaSwitchSinBreak(){
		//Si los casos se dejan sin break, entonces el flujo continuara hasta encontrar la sentencia break
		//No hay un orden predefinido para ubiar los casos, a menos que deban seguir un flujo predeterminado
		int dia = 5; 
		// Si cambiamos el valor de la variable dia = 6 este se ira directamente al case 6 y terminara el flujo
		// Si cambiamos el valor de la vairable dia = 0, este pasara por todos los casos.
		switch(dia){
			case 0:
				System.out.println("Domingo");
			default: //Al no encontrar ningun dia con valor 5, se dirije al metodo por defecto
				System.out.println("Default");
				//Al no encontrar break procedera al siguiente caso.
			case 6:
				System.out.println("Sabado");
				break; //Termina el bloque
		}
	}


	//Siguiendo las reglas observemos el siguiente switch
	/*
	private static int getSortOrder(String firstName, final String lastName){
		String middleName = "Patricia";
		final String suffix = "JR";
		int id = 0;
		switch(firstName){
			case "Test":
				return 52;
			case middleName:  //No compila porque middleName no es final
				id = 5;
				break;
			case suffix:
				id = 0;
				break;
			case lastName: //No compila porque aunque es final, esta no es una constante
				id = 8;
				break;
			case 5: //No compila porque el tipo de dato debe ser un String y no un int
				id = 7;
				break;
			case 'J': // No compila porque el tipo de dato debe ser un String y no un char
				id = 10;
				break;
			case java.time.DayOfWeek.SUNDAY : //es un enum y no un String
				id = 15;
				break;	
		}
		return id;
	}*/

}
