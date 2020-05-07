package polymorphism;
public class Bird {
	private  void move () {
		System.out.println("Different ways");
	}
	Bird createBird() {
		return new Bird();
	}
}
class Swallow extends Bird{
	 void move () {
	System.out.println("FLY");
	}
	Swallow createBird() {
		return new Swallow();
}
}
class Pinguin extends Bird{
	 void move () {
	System.out.println("SWIM");
	}
}
class Straus extends Bird{
	 void move () {
	System.out.println("RUN");
	}
}
class Cracen extends Bird{
	 void move () {
		System.out.println("ANOTHER WAY");
	}
}