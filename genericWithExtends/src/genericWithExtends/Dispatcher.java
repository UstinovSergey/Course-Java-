package genericWithExtends;

public class Dispatcher {

	public static void main(String[] args) {
		Strauss [] s = {new Strauss(40),new Strauss(45)};
		Penguin [] p = {new Penguin(10),new Penguin(11), new Penguin(12)};
		Controller<Strauss> c1 = new Controller(s);
		c1.display();
	}

}
class Bird{
	int weight;
	Bird (int weight){
		this.weight = weight;
	}
	void move() {}
}
class Strauss extends Bird{
	Strauss(int weight){
		super(weight);
	}
	void move() {
		System.out.println("Run");
	}
}
class Penguin extends Bird{
	Penguin(int weight){
		super(weight);
	}
	void move() {
		System.out.println("Swim");
	}
}
class Controller<T extends Bird>{
	T [] array;
	Controller(T [] array){
		this.array = array;
	}
	void display() {
		for(T temp : array) {
			temp.move();
		}
	}
}
