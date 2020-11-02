package negativeOrPositive;

import java.util.Scanner;

public class positiveOrNegative {

 public static void main(String[] args) {
 int a;
 try (Scanner input = new Scanner(System.in)) {
	System.out.println("Please enter any number and this will tell you whether it is negative or positive");
	 a = input.nextInt();
}
 
 minFunction(a);
 
 }
 public static void minFunction(int n1) {
 if (n1 >= 0)
	 System.out.print("you number is positive");
 else
	 System.out.print("you number is negative");
 ;
 }
}