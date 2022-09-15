
public class AutoExplicit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 30;
		System.out.println("The Integer number is: "+num1);
		
		double num3 = num1;
		System.out.println("The Double number is: "+num3);
		
		
		float num2 = (float)num3;
		
		System.out.println("The Floating point number is: "+num2);
		
		num1 = (int)num2;
		
		System.out.println("The integer number is: "+num1);
		
		
	}

}
