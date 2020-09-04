package myprograms;

public class Armstrong3 {

	public static void main(String[] args) {
		for (int i = 0;i<=100;i++) {
			int num = i;
			int temp = num;
			int sum = 0;
			while(num!=0) {
				int rem = num%10;
				sum = sum+ (rem*rem*rem);
				num = num/10;
			}
			if (temp==sum)
				System.out.println(temp+" : Given number is Armstong");
			else
				System.out.println(temp+" : Given number is not Armstrong");
		}
	}

}
