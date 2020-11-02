package greatestNumber;

import java.util.Scanner;

public class greatestNumber {

	 public static void main(String[] args) {
	 int a,b,c;
	 try (Scanner input = new Scanner(System.in)) {
		System.out.println("Please enter three numbers and this program will tell you which one is greatest");
		System.out.println("First Number:");
		 a = input.nextInt();
		 System.out.println("Second Number:");
		 b = input.nextInt();
		 System.out.println("Third Number:");
		 c = input.nextInt();
		 
	}
	 
	 gNumber(a,b,c);
	 
	 }
	 public static void gNumber(int n1, int n2, int n3) {
	 if (n1 > n2 && n1 > n3)
		 System.out.print(n1 + "is your greast number");
	 else if (n2 > n3 && n2 > n1)
		 System.out.print(n2 + "is your greast number");
	 else if (n3 > n1 && n3 >n2)
		 System.out.print(n3 + "is your greast number");
	 else if (n1 == n2 || n1 == n3 || n2 == n3)
		 System.out.print("two or more of the numbers inputted are equal");
}
}