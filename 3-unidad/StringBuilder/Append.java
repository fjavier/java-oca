class Append{
    /*
    El metodo append, agrega contenido al StringBuilder y devuelve la misma referencia.
    Firmas:
    StringBuilder append(String cadena);

    De hecho hay mas de 10 firmas para este metodo, ya que permite agregar como contenido
    varios tipos de datos.
    */
    public static void main(String... a){
	StringBuilder sb = new StringBuilder()
	     .append(1)
	     .append('c');
	sb.append("-").append(true);

	System.out.println(sb); //1c-true
    }
}
