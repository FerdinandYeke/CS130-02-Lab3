//FloatMath.java
/*This program gets two floating point inputs from
 * the user and prints out their sum, difference, and
 * product 
 */

import java.util.Scanner;

public class FloatMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the first floating"
				+ " point number: ");
			float num1 = scan.nextFloat();
			
		System.out.println("Enter the second floating"
				+ " point number: ");
			float num2 = scan.nextFloat();
			
			
			
		System.out.println("The Sum of "+num1+" and "+num2+
				" is: "+(num1 += num2));
		
		System.out.println("The Difference of "+num1+" and "+num2+
				" is: "+(num1 -= num2));
		
		System.out.println("The Product of "+num1+ " and "+num2+
				" is: "+(num1 *=num2));	
	}

}
