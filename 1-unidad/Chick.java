public class Chick{
	private String name = "Fluffy";
	
         {
             System.out.println("Setting fluffy");
             System.out.println(name);
         }

	//private String name = "Fluffy";
	
	public Chick(){
		name = "Tiny";
		System.out.println("Setting constructor");
	}

	public static void main(String a[]){
		Chick chick = new Chick();
		System.out.println(chick.name);
	}

	{
		System.out.println("Finalice la instanciacion de bloque");
	}
}
