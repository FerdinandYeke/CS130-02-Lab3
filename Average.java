//Average.java
/*This program gets an input from three
 * integers from the user's input and prints their
 * average
 * 
 */
import java.util.Scanner;
public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the first integer number: ");
		int num1 = scan.nextInt();
		
		System.out.println("Enter the second integer number: ");
		int num2 = scan.nextInt();
		
		System.out.println("Enter the third integer number: ");
		int num3 = scan.nextInt();
		
		int sum = num1 + num2 + num3;
		
		int average = sum / 3; 
		
		System.out.println("You've entered: "+num1+", "+num2+", and "+num3);
		
		System.out.println("The average is: "+average);

	}

}
