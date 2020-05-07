package arrays;

public class Dispatcher {

	public static void main(String[] args) {
		String [] names = {"Serg","Iren","Mike","Larisa"};
//		System.out.println(names[2]);
//		System.out.println(names.length);
		int [] dates = {21,9,26,4,14,24,19,28};
		for(int i=0;i<names.length;i++) {
//			System.out.println(dates[i]);
//			System.out.println(names[i]);
		}
// summa & average calculating
		int sum = 0;
		for(int i=0; i<dates.length; i++) {
			sum = sum + dates[i];
			
		}
			System.out.println(sum);
			double average = (double)sum/dates.length;
			System.out.println(average);
// search minimuma
			int min = (int)Double.POSITIVE_INFINITY; // + бесконечность
			for (int i =0; i< dates.length; i++) {
				if (dates[i] < min)  {
					min = dates[i];
				}
			}
			System.out.println(min);
// concat arrays
	}
}
