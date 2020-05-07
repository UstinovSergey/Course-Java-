package exceptions1;
public class Dispatcher {
	public static void main(String[] args) {
		int x = 10;
		int y = 0;
		int [] z= {3,6,5,2,8};
		String s = "Serg";
		System.out.println("Start");
		try {
		System.out.println(s.length());
		System.out.println(x/y);
		System.out.println(z[5]);
		
		System.out.println("After dividing");
		}	
		catch (ArithmeticException e) {
			System.out.println("Inside catch Arithmetic");
			System.out.println(e);
		}
		catch (RuntimeException e) {
			System.out.println("Inside catch ");
			System.out.println(e);
		}
/*		try {
		
		}catch (ArithmeticException e) {
			System.out.println("Inside catch Arithmetic");
			System.out.println(e);
		}*/
		System.out.println("End");
	}
}
 