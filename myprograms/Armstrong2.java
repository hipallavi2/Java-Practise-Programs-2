package myprograms;

import java.util.Scanner;

public class Armstrong2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the value");
		int num = scn.nextInt();
		int temp = num;
		int sum = 0;
		while(num!=0) {
			int rem = num%10;
			sum = sum+ (rem*rem*rem);
			num = num/10;
		}
		if (temp == sum)
			System.out.println(temp + " :Given number is Armstrong");
		else
			System.out.println(temp + " :Given number is not a Armstrong");
		scn.close();
	}
}
