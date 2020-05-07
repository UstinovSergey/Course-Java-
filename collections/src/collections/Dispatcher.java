package collections;
import java.util.*;
public class Dispatcher {
	public static void main(String[] args) {
		
		ArrayList<Car> al = new ArrayList();
//		System.out.println(al.size());
//		al.add(5);
//		al.add("Serg");
//		al.add(new Dog("Pitbull"));
		al.add(new Car("BMW"));
		al.add(new Car("Opel"));
		al.add(new Car("Lada"));
		al.add(new Car("Mers"));
/*		System.out.println(al.size());
		System.out.println(al);
//		System.out.println(al.contains("Serg"));
//		al.add(2,10);
		System.out.println(al);
		System.out.println(al.get(4));
		System.out.println(al.indexOf(10));
		al.remove(3);
		System.out.println(al);
		Car find = (Car)al.get(3);
		System.out.println(find);
*/
		Car[] c = new Car [al.size()];
		al.toArray(c);
		c[2] = new Car ("Renault");
		for(Car temp : c) {
			System.out.println(temp);
		}
			System.out.println(al);
		al = new ArrayList (Arrays.asList(c));
		System.out.println(al);
	}
}