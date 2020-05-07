package calculator;

public class Dispatcher {
	public static void main(String[] args) {
		Model m1 = new Model(50,8);  //int x = 10;
		Model m2 = new Model(100,80);  
//		Model m1;  выделяется место со значением null(хранит остатки инф с пред. сеансов)
//		m1 = new Model();
//		m1.x= 50;
//		m1.y= 8;
//		m2.x= 100;
//		m2.y= 80;
//		Controller c = new Controller(); 
		// заменяем обращение через объект на 
		// обращение через класс путем добавления static в классе Controller
		
		int summa = Controller.add (m1);
//		View v = new View();
		View.displayInteger(summa);
		int sub = Controller.substruct(m2);
		View.displayInteger(sub);
	}
}
