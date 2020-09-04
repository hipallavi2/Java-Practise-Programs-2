package stringPrograms;

import java.util.Scanner;

public class AsciiChar {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please provide the string");
		String s = scan.nextLine();
		for(int i=0;i<=s.length()-1;i++) {
			int asciiValue = s.charAt(i);
			System.out.println(s.charAt(i)+" :Ascii Value is "+asciiValue);
			scan.close();
		}
	}

}
