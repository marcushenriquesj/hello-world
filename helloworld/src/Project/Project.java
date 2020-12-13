package Project;

import java.util.Scanner;

public class Project {

	public static void main(String[] args) {
		
		int a;
		
		try (Scanner input = new Scanner(System.in)) { 
		
			System.out.println ("Please enter the total amount of students in the class:");
			 a = input.nextInt();
		String[] Names = new String[a];
		double[] Grades = new double[a];
		
		System.out.println ("Now please enter each student's Name and their respective grade:");
		
		for(int b = 0; b < (a); b++) {
			input.nextLine();
			System.out.println ("Enter students name:");
				Names[b] = input.nextLine();
				System.out.println ("Enter student's respective grade:");
				Grades[b] = input.nextDouble();
		}
		
		
		System.out.println ("Checking class average");
		double Average = average(Names, Grades);
		System.out.println ("Class average is: " + Average);
		
		System.out.println ("Now, Checking Class Standard Deviation: ");
		double dblStandardDev = Stdv(Names, Grades, Average);
		System.out.println ("Class standard Deviation: " + dblStandardDev);
		System.out.println ("Now, Checking for Class Median, Highest grade and lowest grade:");
		double dblmedian = Median(Grades); 
		System.out.println ("Class Median is: " + dblmedian);
		
		}
	
	}
	
	
	private static double average(String[] Names, double[] grades) {
		double average;
		
		double[] dblEachGrade = grades;
		double dblSum = 0;
		
		for(int b = 0; b < dblEachGrade.length; b++) {
			
			dblSum = dblSum + dblEachGrade[b];		
		}
		
		average = dblSum / dblEachGrade.length;

		return average;
	}
	
	

	private static Double Stdv(String[] Names, double[] grades, double Average) {
		
		double dblStandardDev;
		int k = grades.length;
		double[] dblxi = new double[k];
		for(int b = 0; b < dblxi.length; b++) {
			double sub = grades[b];
			dblxi[b] = Math.pow((sub - Average), 2);
		}
		
		double Sum = 0;
		for(int b = 0; b < dblxi.length; b++) {
			Sum = Sum + dblxi[b];	
		}
		double intunder = dblxi.length;
		double intover = 1;
		double N;
		N = (intover/intunder);
		
		dblStandardDev = Math.sqrt(N * Sum);

		return dblStandardDev;
		
	}
	
	
	
	private static double Median(double[] grades) {
		
		
		   
	        for (int i = 0; i < grades.length; i++) {
	            for (int j = i + 1; j < grades.length; j++) {
	                if ( (grades[i] > grades[j]) && (i != j) ) {
	                    double temp = grades[i];
	                    grades[i] = grades[j];
	                    grades[j] = temp;
	                    
	                }
	                else
	                    continue;
	            }
	        }
	        
	        double intmiddle;
	        if((grades.length/2) % 2 == 0) {
	        	
	        	intmiddle = (grades.length/2);
	        }	
	       else {
	    	   intmiddle = (grades.length/2) + 0.5;
	       }
	        	
	    double median = grades[(int) intmiddle]; 
	    
	    int k = grades.length - 1;
	    double high = grades[k];
	    System.out.println ("Class Highest Grade is: " + high);
	    double low = grades[0];
	    System.out.println ("Class Lowest Grade is: " + low);
	    
		return median;
		
		
	}
	
	
}
