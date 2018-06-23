public class InitializerBlock{
	public static void main(String argumentos[]){
		{
			{
				System.out.println("Hola desde bloque interno");
			}
			System.out.println("Feathers");
		}
	}{
		System.out.println("Snowy");
	}
}
