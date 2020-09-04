
package stringPrograms;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		System.out.print("Please provide the string : ");
		String str = scn.nextLine();
		String reverse = "";
		for(int i=str.length()-1;i>=0;i--) {
			System.out.print(reverse+str.charAt(i));
			
		}
		scn.close();
	}

}
