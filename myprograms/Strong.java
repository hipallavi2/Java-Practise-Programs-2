package myprograms;

import java.util.Scanner;

public class Strong {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");				
		int number = sc.nextInt();
		int fact,sum = 0;
		int num = number;
		while(num != 0)  //  Strong Number is the number whose sum of factorial of the digits in any 
		//number is equal to the given number.
		{	
			fact = 1;
			int rem = num % 10; //145 =1==1,4==24,5==120(1+24+120=145)
			for(int i = rem ; i >= 1 ; i--) 
				fact = fact * i;
			sum = sum + fact;
			num=num/10;
			
		}
		if(sum == number)
			System.out.println("Strong Number");
		else
			System.out.println("Not a Strong Number");
		sc.close();													
	}
}
