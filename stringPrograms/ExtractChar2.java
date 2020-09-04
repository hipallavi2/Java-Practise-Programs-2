package stringPrograms;

import java.util.Scanner;

public class ExtractChar2 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Please provide the string");
		String str = scn.nextLine();
		for(int i=0;i<str.length();i++) {
			System.out.println(str.charAt(i));
		}
		scn.close();
	}

}
