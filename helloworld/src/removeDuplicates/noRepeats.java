package removeDuplicates;

import java.util.Arrays;
import java.util.Scanner;

public class noRepeats {
	
  
	public static void main(String[] args) {
		int a;
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("this program will remove any duplicated characters in a user created list");
			System.out.println ("Please enter the amount of characters you will enter for your list");
			 a = input.nextInt();
		removeDuplicates(a);
	}
}
	
	
	public static void removeDuplicates(int a) {
		try (Scanner scan = new Scanner(System.in)) {
			String[] list = new String[a];
			
			for(int i = 0; i <= (list.length - 1); i++) {
				System.out.println("please enter a character you will add to this array");
				String character = scan.nextLine();
				list[i] = character;
				
			}
			System.out.println("thank you, your array consists of these characters: " + Arrays.toString(list));
			System.out.println("the system is now checking wether there are any duplicated characters");
			
			int howManyLess = 0;
			for(int b = 0; b < list.length; b++) {
				for(int j = (b + 1); j < list.length; j++) {
					if(list[b].equals(list[j])) {
						b = 0;
						int removeIndex = j;
						howManyLess++;
						for(int k = removeIndex; k < list.length - 1; k++) {
							list[k] = list[k+1];
							}
					 list[list.length - howManyLess] = null;
					 break; 
						}	
					}	
				}
			
			int newListSize; 
			newListSize = a - howManyLess ;
			System.out.println("there were a total of "+ howManyLess + " duplicates in your array");
			String[] newList = new String[newListSize];
			for(int m = 0; m < newList.length; m++) {
				newList[m] = list[m];
			}	
			System.out.println("your new array is of length "+ newListSize + " and consists of: " +Arrays.toString(newList));
		}	
	}
}