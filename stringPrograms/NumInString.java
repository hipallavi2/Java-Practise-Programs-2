package stringPrograms;

import java.util.Scanner;

public class NumInString {

	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		System.out.println("provide the string");
		String s = scn.nextLine();
		boolean flag = false;
		for(int i =0;i<=s.length()-1;i++) {
			int asciiValue = s.charAt(i);
			if(asciiValue>=48 && asciiValue<=57) 
				flag = true;
		}
			System.out.println(flag);
			scn.close();
	}
}
