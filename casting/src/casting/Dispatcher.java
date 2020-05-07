package casting;
public class Dispatcher {
	public static void main(String[] args) {
	int x = 50;
	double y = 3200000000.0;
	double z = x;
//	int a = y;
	int a = (int)y; 
//	System.out.println(a);
	Animal an = new Animal();
	Dog d = new Dog();
	Cat c = new Cat();
	Animal ad = new Dog();
	Animal ac = new Cat();
	if (d instanceof Animal) {
//		an = d;
		System.out.println(1);
	}
	if (an instanceof Dog) {
	d = (Dog)an;
	System.out.println(2);
	}
	if (ac instanceof Dog) {
	d = (Dog)ac;
	System.out.println(3);
	}
//	boolean b = an instanceof Dog;
//	System.out.println(b);

	}

}
