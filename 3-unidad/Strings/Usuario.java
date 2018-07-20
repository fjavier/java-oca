/*
Veremos un ejemplo practico de Cadenas.
Creación y manipulación de cadenas
*/
public class Usuario{

	private String nombreCompleto;
	private String primerNombre;
	private String primerApellido;
	private String username;

	public static void main(String... a){
		Usuario usuario = new Usuario();
		//De esta manera creamos un objeto de Tipo Cadena
		String username = "Cisco505";
		//Tambien existe esta otra manera
		username = new String("Cisco505");
		usuario.username = username;
		usuario.primerNombre = "Francisco";
		usuario.primerApellido = "Briceño";
		usuario.nombreCompleto = usuario.obtenerNombreCompleto(usuario.primerNombre, usuario.primerApellido);
		usuario.imprimirNombreCompleto();
	}

	//Para obtener el nombre Completo voy a realizar una concatenación
	public String obtenerNombreCompleto(String nombre, String apellido){
		/*Reglas para concatenación
		1.- Si ambos operandos son númericos, esto es una suma
		2.- Si ambos operando son Cadenas, esto es una concatenación
		3.- La expresion es evaluada de Izquierda a derecha
		*/
		int three = 3;
		String four = "4";
		String concatenacion = 1+2+three+four;//Esto da como resultado 64
		//Si aplicamos el operador += esto tambien es una concatenación
		concatenacion+="5"; //645
		
		//Esto es una concatenación Simple
		return nombre +" " + apellido;
	}
	
	
	public void imprimirNombreCompleto(){
		System.out.println(this.nombreCompleto);
	}
	
}
