package testing;
import java.util.Scanner;
public class forLoop {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		
		//int counter = 0;
		int number = -1;
		while(number !=0) {
			System.out.println("Enter a number or 0 to exit: ");
			number = input.nextInt();
			for (int i = 1; i <= number; i++) {
				for( int counter =0; counter < i; counter++) {
				System.out.println(counter + " " + i + " ");
				if( i == number ) {
					break;
				}
				}
			}
		}
		System.out.println("You have exit");

		input.close();
		//		for (int i =0;; i++) {
		//		i = input.nextInt();
		//		if (i % 2 == 1) {
		//			System.out.println("odd");
		//		} else if (i == 0) {
		//			break;
		//		} else {
		//			System.out.println("even");
		//		}
		//		}
		//		for (int c = 1; c <= 5; c++) {
		//		    for (int r = 1; r <= c; r++) {
		//		        System.out.print(" * ");
		//		    }System.out.println();
		//		}



		//		for ( int i = 1; i <=5; i ++) {
		//			for ( int j = i ; j < 5; j ++) {
		//				System . out . print ( " " ) ;
		//			}for ( int j = 1; j <= i ; j ++) {
		//				System . out . print ( "* " ) ;
		//			}System . out . println () ;
		//		}

		//		
		//
		//		String [] cars = {"Honda,fit", "Toyota,Corola", "BMW,M3"};
		//		for(String car : cars) {
		//			System.out.println(car.replace(",", " " ));
		//		}
		//		for (int i = 1; i <= 5; i++) {
		//			System.out.print("I: " + i);
		//			for (int j = 1 ; j<=10; j++) {
		//				System.out.print("\tj: " + j);
		//			}
		//			System.out.println();
		//		}
	}
}
