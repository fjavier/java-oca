public class NotValidInitialization{
	public void findAnswer(boolean check){
		//Declaración de variables
		int answer; 
		int onlyOneBranch; 

		if(check){
			onlyOneBranch = 2;
			answer = 1;
		}else{
			answer =2;
		}
	System.out.println(answer);
	System.out.println(onlyOneBranch); //No compila porque no se inicializa en el else
	}

	public static void main(String a[]){}
}
