package weekdays;

import java.util.Random;
import java.util.Scanner;

public class weekdays {
	 public static void main(String[] args) {
		 int a;
		 try (Scanner input = new Scanner(System.in)) {
			System.out.println("Please enter a random number and this will generate a week day");
			 a = input.nextInt();
		 }
	 
	 generate(a);
	 
	 String daystring="";
	 
	 switch(generate(a)){
	 //case statements within the switch block
	 case 1: daystring="1 - monday";
	 break;
	 case 2: daystring="2 - tuesday";
	 break;
	 case 3: daystring="3 - wednesday";
	 break;
	 case 4: daystring="4 - thursday";
	 break;
	 case 5: daystring="5 - friday";
	 break;
	 case 6: daystring="6 - saturday";
	 break;
	 case 7: daystring="7 - sunday";
	 break;
	 
	 }
	 System.out.print(daystring);
	 }
public static int generate(int a) {
	
	Random randGen = new Random(a);
	int generate = randGen.nextInt(7);
	return generate;
	}
}