public class CicloFor{
	public static void main(String... args	){
		recorriendoArreglo();
		ejemploArregloBidimensional();
		buscarIndicesEnCicloFor();
	}

	public static void recorriendoArreglo(){
		int[] valores = new int[3];
		valores[0] = 10;
		valores[1] = new Integer(5);
		valores[2] = 15;
		for(int i = 1; i < valores.length ; i++){
			System.out.println((valores[i] - valores[i - 1]));	
		}
	}
	
	//USO DE ETIQUETAS EN CICLOS
	public static void ejemploArregloBidimensional(){
		int[][] arregloComplejo = {{5,2,1,3},{3,9,8,9},{5,7,12,7}};
		OUTER_LOOP: for(int[] simpleArreglo: arregloComplejo){
			INNER_LOOP:	for(int i = 0; i < simpleArreglo.length ; i++){
						System.out.println(simpleArreglo[i]+"\t");	
					}
			System.out.println();
		}
	}

	public static void estructuraSentenciaBreak(){
		/*
		La etiqueta Break rompe ciclos le devuelve el control al bloque exterior
		etiquetaOpcional: while(expresionBooleana){
			//Cuerpo
			//En algun lugar del loop
			break etiquetaOpcional;

		}*/
	}

	public static void buscarIndicesEnCicloFor(){
		int[][] lista = {{1,13,5},{1,2,5},{2,7,2}};
		int valorBuscar = 2;
		int posicionX = -1;
		int posicionY = -1;
		LOOP_PADRE: for(int i = 0; i < lista.length ; i++){
			for(int j = 0; j < lista[i].length; j++){
				if(lista[i][j]==valorBuscar){
					posicionX = i;
					posicionY = j;
					break LOOP_PADRE; //¿QUE SUCEDIERA SI QUITARAMOS LOOP_PADRE?
				}
			}
		}

		if(posicionX == -1 || posicionY == -1){
			System.out.println("Valor:"+valorBuscar+" No encontrado");	
		}else{
			System.out.println("Valor:"+valorBuscar+" Encontrado en : ("+posicionX+","+posicionY+")");
		}

	}

	public static void estructuraContinue(){
		//La etiqueta CONTINUE termina el bloque pero le da nuevamente el control
		//al flujo mas cercano, a menos que este tenga una etiqueta.
		/*
		etiquetaOpcional: while(expresionBooleana){
			//Cuerpo
			//En alguna parte del ciclo
			continue etiquetaOpcional;
		}
		*/
	}

}
