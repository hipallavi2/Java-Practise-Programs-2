package myprograms;

import java.util.Scanner;

public class Fibonacci2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Please provide the number upto You want to take Fibonacci series");
		int num = scn.nextInt();
		int num1=0, num2=1,num3;
		System.out.print("Fibonacci series upto given number is:- " + num1+" "+num2);
		for(int i=1;i<=num;i++) {
			while(num1+num2<=100) {
				num3=num1+num2;
				System.out.print(" "+ num3);
				num1=num2;
				num2=num3;
			}
		}
		scn.close();
	}
}
