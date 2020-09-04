package myprograms;

import java.util.Scanner;

public class Factorial2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Please provide the input");
		int num = scn.nextInt(); // taking number as 4
		
		int fact = 1;
		for(int i=2;i<=num;i++) {
			fact = fact*i; //(1*2)=2 (2*3=6) (6*4=24)
		}
		    System.out.println("Factorial of given number is :-"+ fact);
		    
		scn.close();
	}

}
