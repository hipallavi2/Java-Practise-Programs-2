package myprograms;

import java.util.Scanner;

public class Palindrome2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Please provide the inputs");
		int num = scn.nextInt();
		int temp = num;
		int rev = 0;
		while (num!=0) {
			int rem = num%10;
			num = num/10;
			rev = rev*10 + rem;
		}
		if (temp==rev) {
			System.out.println("Given number is Palindrome");
		}
		else
			System.out.println("Given number is not palindrome");
		
		scn.close();
	}

}
