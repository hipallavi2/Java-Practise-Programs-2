package forQuestions;

public class Q33 {
		static int s=4;
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=s;j++) {
				System.out.print(' ');
			}
			for( int k=1;k<=i;k++) {
				System.out.print('*');
			}
			for(int t=1;t<i;t++) {
				System.out.print('*');
			}
			s--;
			System.out.println(' ');
		}
	}

}
