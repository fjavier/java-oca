class Igualdad{
    public static void main(String a[]){
	StringBuilder x = new StringBuilder();
	StringBuilder b = new StringBuilder();
	StringBuilder c = x;

	System.out.println(x==b);//Falso
	System.out.println(c==x); //Verdadero

    }
}
