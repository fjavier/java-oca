class LowerUpperCase{
    /*Estos metodos hacen exactamente a como suenan.
    toLowerCase -> Convierte a minusculas la cadena
    toUpperCase -> Convierte a mayusculas la cadena.
    Debido a que las cadenas son inmutables, esta permanece a como tal y se crea un nuevo objeto
    */
    public static void main(String... a){
    	String cadena = "aniMALS";
	String cadenaMayuscula = cadena.toUpperCase(); //Resultado: ANIMALS
	String cadenaMinuscula = cadena.toLowerCase(); //Resultado: animals.
	System.out.println(cadena);
	System.out.println(cadenaMayuscula);
	System.out.println(cadenaMinuscula);
    }

}
