//MilesPerGallon.java
/*This program calculates the MPG for a tank
 * of gas for a car by the user's input
 */

import java.util.Scanner;

public class MilesPerGallon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number of miles "
		+"driven: ");
		int num1 = scan.nextInt();
		
		System.out.println("Enter the number of gallons of gas "
				+"in tank: ");
		int num2 = scan.nextInt();
		
		double MPG = num1 / num2;
		System.out.println("The MPG is: "+MPG);
		
		

	}

}
