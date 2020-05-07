package initialization;
public class Dispatcher {
	public static void main(String[] args) {
		House h = new House("Yellow");
		System.out.println(h.color + " " + h.square);
		System.out.println(h.d.height);
	}

}
