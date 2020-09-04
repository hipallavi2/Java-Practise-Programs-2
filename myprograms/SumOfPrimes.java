package myprograms;

import java.util.Scanner;

public class SumOfPrimes {

	public static void main(String[] args) {
		int sum=0,i,j,k;
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter the limit");
		int num=scn.nextInt();
		for( i=2;i<=num;i++) {
			k=0;
			for(j=2;j<i;j++) {
				if(i%j==0) {
					k=1;
					break;
				}
			}
			
			if(k==0) {
				sum+=i;
			}
		}
		System.out.println("sum: "+ sum);
		scn.close();
	}

}
