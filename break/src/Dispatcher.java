public class Dispatcher {
	public static void main(String[] args) {
		for (int i = 0; i<3; i++) {
			for (int j = 10; j <20; j++) {
				System.out.print(j+i*10 + " ");
			}
			System.out.println();
		}
	}

}
