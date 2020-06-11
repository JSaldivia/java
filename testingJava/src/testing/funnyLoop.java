/*
 * This is for loop practice exercises from
 * http://www.beginwithjava.com/java/loops/questions.html
 */
package testing;
import java.util.*;
public class funnyLoop {
	public static void main(String[] args) {
		Scanner input = new  Scanner(System.in);

		//Write a program to print numbers from 1 to 10.
		System.out.println("Write a program to print numbers from 1 to 10\n");
		for(int i = 1; i <11; i++) {
			System.out.print(i + "\t");
		}

		System.out.println("\n-\t-\t-\t-\t-\t-\t-\t-\t-\t-\n");

		//Write a program to calculate the sum of first 10 natural number.
		System.out.println("Write a program to calculate the sum of first 10 natural number.\n");
		int sum = 0;
		for (int i = 0; i < 11; i ++) {
			sum += i;
			System.out.println("sum: " + sum);
		}

		System.out.println("\n-\t-\t-\t-\t-\t-\t-\t-\t-\t-\n");


		/* Write a program that prompts the user to input a positive integer. 
		 * It should then print the multiplication table of that number. 
		 */
		System.out.println("Write a program that prompts the user to input a positive integer. "
				+ "	It should then print the multiplication table of that number. ");

		System.out.println("Enter a number: ");
		int userTable = input.nextInt();
		for(int i = 0; i < 11; i++) {
			int result = i * userTable;
			System.out.println("table of " + userTable + " * " + i +" = "+ result);
		}

		System.out.println("\n-\t-\t-\t-\t-\t-\t-\t-\t-\t-\n");
		/*Write a program to find the factorial value of any number entered through the keyboard.
		 */

		System.out.println("Write a program to find the factorial value of any number entered through the keyboard.");
		int result = 1;
		int userF = input.nextInt();
		for (int i = userF; i > 0; i--){
			result *= i;
			System.out.println(i + " * " + userF + " = " + result);
		} 
		System.out.println("\nFactorial of " + userF + " is "+ result);
		/*
		 * 		Question 5
		 *	Two numbers are entered through the keyboard. Write a program to find the value of one number raised to the power of another. (Do not use Java built-in method)
		 */



	}
}
