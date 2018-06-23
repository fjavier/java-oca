public class Discounter{
	static double  percent;
	int offset = 10, base = 50;

	public static double calc(double value){
		int coupon, offset, base;
		if(percent <= 10){
			coupon = 10;
			offset = 10;
			base = 10;
		}
		return coupon * offset * base / 100;
	}

	public static void main(String a[]){
		System.out.println(calc(100));
	}
}
