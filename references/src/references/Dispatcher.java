package references;
public class Dispatcher {
	public static void main(String[] args) {
		int x = 10;		
//		System.out.println(x);
		x = changeAndDisplay(x);
//		System.out.println(x);
		Car c = new Car();
		c.price = 4500;
		c.enginePrice = 2500; 
		changeObject(ñ);
//		c.price = changeAndDisplay(c.price);
//		c.enginePrice = changeAndDisplay(c.enginePrice);   
		System.out.println(c.price);
		System.out.println(c.enginePrice);
	}
	static int changeAndDisplay( int x) {
		x = x*2;
//		System.out.println(x);
		return(x);
	}	
	static void changeObject (Car c){
		c.price = c.price*2;
		c.enginePrice = c.enginePrice*2;
	}
}
