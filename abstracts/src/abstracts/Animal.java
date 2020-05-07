package abstracts;
public abstract class Animal {
	String brade;
	abstract void say();
	void eat() {}
	Animal(){
		System.out.println("Abstract constructor");
	}
}
