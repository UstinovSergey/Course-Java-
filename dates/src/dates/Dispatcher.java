package dates;
import java.util.*;
public class Dispatcher {

	public static void main(String[] args) {
		GregorianCalendar gc = new GregorianCalendar();
//		System.out.println(gc.get(Calendar.DAY_OF_MONTH));
//		System.out.println(gc.get(Calendar.DAY_OF_YEAR));
//		System.out.println(gc.get(Calendar.MONTH));
		gc.set(Calendar.MONTH, Calendar.DECEMBER);
		gc.set(Calendar.DAY_OF_MONTH,21);
//		System.out.println(gc.get(Calendar.DAY_OF_WEEK));
		GregorianCalendar gc1 = new GregorianCalendar(2020,Calendar.APRIL, 20);
//		System.out.println(gc1.get(Calendar.DAY_OF_WEEK));
		GregorianCalendar gc2 = new GregorianCalendar(2016,Calendar.DECEMBER, 28);
		gc2.add(Calendar.DAY_OF_MONTH, 5);
		System.out.println(gc2.get(Calendar.DAY_OF_MONTH));
		System.out.println(gc2.get(Calendar.MONTH));
		System.out.println(gc2.get(Calendar.YEAR));
		Date d1 = gc2.getTime(); //convert GC to Date
		gc.setTime(d1);          // convert Date to GC
	}

}
