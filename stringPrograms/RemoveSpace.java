package stringPrograms;

import java.util.Scanner;

public class RemoveSpace {

	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		System.out.println("Please provide the string");
		String str=scn.nextLine();
		System.out.print(str.replace(" ", ""));
		
		scn.close();
	}
	

}
