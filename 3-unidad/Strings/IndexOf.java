class IndexOf{
    /*El metodo indexOf obtiene el indice donde se encuentra la primera
    coincidencia del texto pasado como parametro, en caso que no se encuentre este devolvera -1
    firmas:
    int indexOf(int ch);
    int indexOf(char ch, int fromIndex);
    int indexOf(String coincidencia);
    int indexOf(String coincidencia, index fromIndex);
    
    */
    public static void main(String a[]){
          String string = "Bufalo";
	  System.out.println(string.indexOf('a')); //3
	  System.out.println(string.indexOf("al")); //3
	  System.out.println(string.indexOf('a',3)); //3
	  System.out.println(string.indexOf("alo",6)); //-1
	
    }
}
