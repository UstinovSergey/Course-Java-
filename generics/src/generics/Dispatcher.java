package generics;
public class Dispatcher {

	public static void main(String[] args) {
		GenericTest<String> t1 = new GenericTest ("Serg");
		GenericTest<Integer> t2 = new GenericTest (2);
		GenericTest<Car> t3 = new GenericTest (new Car("BMW"));
		t1.display();
		t2.display();
		t3.display();
		t1=t2
	}

}
class GenericTest <T>{
	T obj;
	GenericTest(T obj){
		this.obj = obj;
	}
	void display (){
		System.out.println(obj);
	}
}
class Car{
	String model;
	Car(String model){
		this.model = model;
	}
	public String toString() {
		return this.model;
	}
}