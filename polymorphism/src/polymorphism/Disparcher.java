package polymorphism;

public class Disparcher {

	public static void main(String[] args) {
		Bird s = new Swallow();
		Bird p = new Pinguin();
		Bird st = new Straus();
		Bird c = new Cracen();
		
		Bird [] b = {s, st, p, c};
		for(Bird temp : b) {
			polyMoves(temp);
		}
		Bird p1 = new Pinguin();
		p1.move();
	}
	static void polyMoves(Bird bird) {
//		bird.move();
	}
	Swallow creator = new Swallow();
	Swallow s1 = creator.createBird();
	Swallow s2 = creator.createBird();
	Swallow [] sw = {s1,s2};
}
