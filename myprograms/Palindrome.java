package myprograms;

public class Palindrome {

	public static void main(String[] args) {
		
		for(int i=10;i<=100;i++) {
			int num=i;
			int temp = num;
			int rev = 0;
			
			while(num!=0) {
				int rem = num%10;
				num = num/10;
				rev = rev*10 + rem;
			}
		
			if (temp==rev)
				System.out.println(temp + ":- Given number is palindrome");
			else
				System.out.println(temp + ":- Given number is not palindrome");
		}
	}
}
