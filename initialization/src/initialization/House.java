package initialization;

public class House {
	int square = 160;
	String color;
	{
	System.out.println("Hurra!!! We will build a House");
	}
	Door d = new Door(210);
	
		House (String c){ 
		color = c;
		System.out.println("Inside house constructor");
	}
}

class Door{
	int height;
	Door(int h){
		height = h;
		System.out.println("Inside door constructor");
	}
}  