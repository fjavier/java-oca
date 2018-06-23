public class NotValidLocalVariable{
	public int notValid(){
		int x = 10;
		int y;
		return x+y;	
	}

	public static void main(String a[]){
		NotValidLocalVariable x = new NotValidLocalVariable();
		x.notValid();
	}
}
