class Insert{
    /*
    El metodo insert agrega caracteres en una posición en especifica, esta posición
    esta dada por el index que se le pasa como parametro, asi como el metodo append
    este metodo tiene muchas firmas.

    Firma:
    StringBuilder insert(int index, String cadena);
    */
    public static void main(String... a){
        StringBuilder sb = new StringBuilder("animals");
	sb.insert(7,"-"); //animals- (Inserta el guion en la posicion 7)
	sb.insert(0,"-"); //-animals- (Inserta el guion en la posicion 0)
	sb.insert(4,"-"); //-ani-mals- (Inserta el guion en la posicion 4)
	System.out.println(sb); //-ani-mals-

    }
}
