package Adding;

import java.util.Scanner;

public class add {

	public static void main(String[] args) {
		// this coding will take a inputted integer and add 1
		
		int x,y, inc = 1;
	
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("please enter a number you want to increase by one");
			x = input.nextInt();
		}
		System.out.println("thank you the number you inputed increase by one is");
		y = x + inc;
		System.out.println(y);
	}

}
