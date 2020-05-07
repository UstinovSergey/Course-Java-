package interfaces;

abstract public class Animal implements Lifeable, OtherInterfase {
	abstract void say();
	public void live(){
		System.out.println("From");
	}
}
class Dog extends Animal{
	void say(){
		System.out.println("Woof");
	}
	public void otherMethod() {}
}
