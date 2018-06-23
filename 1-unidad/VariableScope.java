public class VariableScope{
	public void eatIfHungry(boolean hungry){
		if(hungry){
			int bitesOfCheese = 1;
		}
		System.out.println(bitesOfCheese); //Variable fuera del Scope del bloque if
		//Es decir que su alcance solo se limita al bloque condicional If
	}
	
}
