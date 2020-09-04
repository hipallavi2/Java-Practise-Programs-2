package myprograms;

import java.util.Scanner;

public class PrimeNumber2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Please provide the input");
		int num = scn.nextInt();
		int count =0;
		for(int i =1;i<=num;i++) {
			if(num%i==0)
				count++;
		}
		if(count==2)
			System.out.println("Given number is prime number");
		else
			System.out.println("Given number is not a prime number");
		
		scn.close();
		
	}

}
