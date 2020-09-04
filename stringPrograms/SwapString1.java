package stringPrograms;

import java.util.Scanner;

public class SwapString1
{     
    public static void main(String args[]) 
    { 
    	Scanner scn = new Scanner(System.in);
    	System.out.println("Please enter the String");
    	String s1 = scn.nextLine();
    	System.out.println("Please enter the 2nd String");
    	String s2 = scn.nextLine();
    	s1=s1+s2;
        s2= s1.substring(0,s1.length()-s2.length()); 
        s1= s1.substring(s2.length()); 
        System.out.println("Strings after swap: str = " + s1+ " and str1= " + s2); 
        scn.close();
    }
}
