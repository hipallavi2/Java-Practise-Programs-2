package stringPrograms;

import java.util.Scanner;

public class OccuranceEachChar {

	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		System.out.println("Enter the string");
		String s= scn.nextLine();
		for(int i=0;i<=s.length()-1;i++) {
			int count=0;
			for(int j=0;j<=s.length()-1;j++) {
				if(s.charAt(i)==s.charAt(j)&&i>j)
					break;
				if(s.charAt(i)==s.charAt(j))
					count++;
			}
			if(count>0)
				System.out.println(s.charAt(i)+ " occurance is "+ count);
		}
		scn.close();
	}

}
