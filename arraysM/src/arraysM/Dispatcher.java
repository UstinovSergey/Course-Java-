package arraysM;
import java.util.Arrays;
public class Dispatcher {
	public static void main(String[] args) {
		int [] x = {4,3,8,5,1,7,0,2};
		Arrays.sort(x);
		int index = Arrays.binarySearch(x,7);
		System.out.println(index);
		
		String[] sa; //Arrays sa = new Arrays(String,3);
		sa = new String [3];
		String s1 = "Serg";
		String s2 = "Mary";
		String s3 = "Paul";
		sa[0] = s1;
		sa[1] = s2;
		sa[2] = s3;
		int[][] z = {{2,5},{6,2,1,9},{1},{8,4,5}};
		int[][] t;
		t= new int[4][];
		t[0] = new int [2];
		t[0][0] = 2;
		t[0][1] = 5;
		
	}
}
