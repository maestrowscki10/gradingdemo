package performanceChecker ;

import java.util.Scanner;

public class PerformanceChecker {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String name;
		double test;
		double ass;
		double UE;
		double CA;
		double sum;
		
		System.out.println("IS 055 PERFORMANCE CHECKER:");
		System.out.println("***************************");
		
		System.out.print("Enter Student Name: ");
		name = input.next();
		
		do {
		System.out.print("Enter Assignment Marks (Not less than 0 or more than 20): ");
		ass = input.nextDouble();}
		while (ass < 0 || ass > 20);
		
		do{
		System.out.print("Enter Test Marks (Not less than 0 or more than 20): ");
		test = input.nextDouble();}
		while(test < 0 || test > 20);
		
		do { 
		System.out.print("Enter UE Marks (Not less than 0 or more than 60): ");
		UE = input.nextDouble();}
		while(UE < 0 || UE > 60);
						
		CA = test + ass;
		sum = CA + UE;
		
		if (CA < 20) {
		
			System.out.println("STATUS: FAILED, CA BELOW 50%");
			System.out.println("Comment: You have FAILED the course dear "+name);
		}
			
		else if (UE < 30) {
			System.out.println("STATUS: FAILED, UE BELOW 50%");
			System.out.println("Comment: You have FAILED the course dear "+name);
		}
		
		else {
			System.out.print("STATUS: PASSED, TOTAL MARKS: "+sum);
			if (sum >= 75) {
				System.out.println(", GRADE A.");
			}
			else if (sum >= 60 && sum < 75) {
				System.out.println(", GRADE B+.");
			}
			else if (sum >= 50 && sum < 60) {
				System.out.println(", GRADE B.");
			}
			else {
				System.out.println(", GRADE C.");
			}
			System.out.println("Comment: You have PASSED the course dear "+name);
		}
			System.out.println("***************************");
		} 
	}
