package stringPrograms;

import java.util.Scanner;

public class PalindromeString {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = scn.nextLine();
		String rev = "";
		for(int i=s.length()-1;i>=0;i--) {
			rev = rev+s.charAt(i);
		}
		if(s.equals(rev))
			System.out.println("It is a Palindrome");
		else
			System.out.println("It is not a Palindrome");
		scn.close();
	}
}
