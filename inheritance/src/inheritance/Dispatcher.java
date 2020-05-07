package inheritance;

public class Dispatcher {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.name = "Rex";
		d.price = 50;
		d.brade = "Poodle";
		d.weight = 6;
		System.out.println(d.name+" "+ d.price+" "+d.brade+ " "+d.weight);
	}

}
