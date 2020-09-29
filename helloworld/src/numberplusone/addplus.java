package numberplusone;

import java.util.Scanner;
 //This code will allow a user to input two numbers and output the sum of those numbers

public class addplus {

	public static void main(String[] args) {
		int x,y,z;
		Scanner input = new Scanner(System.in);
		
		System.out.println("please input one number");
		x = input.nextInt();
		
		System.out.println("please input the second number");
		y = input.nextInt();
		
		System.out.println("thank you the number you inputed are " +x +" and " +y);
		
		z = x + y;
		System.out.println("the sum of your two numbers is " +z);
		
	}

}
