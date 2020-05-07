package arrays2;

public class Dispatcher {

	public static void main(String[] args) {
// concat arrays
	int [] x = {3,2,7,-5,9,-3,-8,1,-2};
//	int [] y = {6,4,3,9,7};
//	int [] result = new int [x.length + y.length];
//	for(int i = 0; i <x.length; i++) {
//		result[i] = x[i];
//	}
//	for(int i=0; i<y.length; i++) {
//		result[i+ x.length] = y[i];
//	}
//	for(int i=0; i<result.length; i++) {
//		System.out.print(result[i] + " ");
//		}
	int countNeg = 0;
	for(int i = 0; i <x.length; i++) {
		if(x[i]<0) {countNeg++;
			}		
		}
//	System.out.print(countNeg);
	int [] poz = new int [x.length - countNeg];
//	System.out.print(poz.length);
	int [] neg = new int [countNeg];
	int p = 0;
	int n = 0;
	
	for (int i = 0; i < x.length; i++) {
		if (x[i]<0) {
			neg [n++] = x[i];
//			n++;
		}else { 
			poz [p++] = x[i];
//		p++;
		}
		}
	for (int i= 0;i<poz.length; i++) {
	System.out.print(poz[i]+" ");
	}
	System.out.println();
	for (int i= 0;i<neg.length; i++) {
		System.out.print(neg[i]+ " ");
		}
	}
	}

 