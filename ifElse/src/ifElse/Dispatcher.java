package ifElse;

public class Dispatcher {

	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		boolean isGreater = x > y;
		boolean isEqual = x == y;
		boolean isNotEqual = x!=y;
		//System.out.println(isNotEqual);
		
//		int myMoney = 38;
//		int ticketPrice = 35;
//		boolean haveEnoughMoney = myMoney >= ticketPrice;
//		boolean haveFriends = true;
//		
//		if (haveEnoughMoney && haveFriends){ // (И);l && -сокращенное "или", если первое TRUE то дальше не проверяется
//			System.out.println("Go to the Cinema!");
//		}else{
//			System.out.println("Go to home games!");
//			}
//		
//		boolean haveCash = false;
//		boolean haveCard = true;
//				
//		if (haveCash||haveCard){ //(ИЛИ); || - сокращенное "или", если первое TRUE то дальше не проверяется
//			System.out.println("Go to the Cinema!");
//		}else{
//			System.out.println("Go to home games!");			
//		}
//		
		int a = -10;
//		if(a < 0) {
//		a = -a;
//		}else {
//			a = a;
//		}
		a = (a < 0) ? -a : a;
//		1      2       3   4
//             true  1 = 3
//		       false 1 = 4 
		
		System.out.println(a);
	}
}
