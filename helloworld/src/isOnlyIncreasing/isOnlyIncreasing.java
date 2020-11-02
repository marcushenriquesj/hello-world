package isOnlyIncreasing;

import java.util.Scanner;

public class isOnlyIncreasing {
	
	
	
	public static void main(String[] args) {
		
	
		int a,b,c,d,e;
		try (Scanner input = new Scanner(System.in)) {
			System.out.println ("please enter 5 numbers in sequence, this program will tell you if the list of intergers you put in is in order from least to greatest");
			
			System.out.println ("first number:");
			 a = input.nextInt();
			 System.out.print ("second number:");
			 b = input.nextInt();
			 System.out.print ("third number:");
			 c = input.nextInt();
			 System.out.print ("fourth number:");
			 d = input.nextInt();
			 System.out.print ("fifth number:");
			 e = input.nextInt();
			 isStrictlyIncreasing(a,b,c,d,e); //these are the inputted numbers being set as the parameters for the method
		}
	}
	public static void isStrictlyIncreasing(int a, int b, int c, int d, int e) {
		
		double[] list = new double[5]; // creating array
		list[0] = a;
		list[1] = b;	
		list[2] = c;
		list[3] = d;
		list[4] = e; // setting the indexs equal to the numbers inputted by user in order
		int i; //creating int for the loop
		
		for(i = 0; i < list.length - 1; i++) {   //the parameters and syntax for the loop
		   if (list[i] <= list[i + 1]) //checking if each number is in order
			   continue;
		   
		   else if (list[i] > list[i + 1]) {   //checking if a number is not in order
			   System.out.println("your list is not sorted least to greatest");
			   break;}
		   }
		
		if (i == list.length -1) {   //at end of loop this checks if the loop has been completed, if no failures occur that 
			                         //break the loop then output shows list is sorted
		System.out.println("this list is sorted");}
		}
	}

