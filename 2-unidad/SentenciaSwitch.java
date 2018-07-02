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
	
		int dia = 5;
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

}
