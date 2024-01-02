package patternCode;

import java.util.Scanner;

public class patternPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number");
		int n = s.nextInt();
		int p1 =1;
		int i =1;
		while(i<=n) {
			int j = 1;
			p1=i;
//			char p = (char)('A'+i-1);
			
			while(j<=i) {
				char p = (char)('A'+p1-1);
				System.out.print(p);
				p1 =  (char) (p1-1);
				j = j+1;
			}
			System.out.println();
			
			i =i+1;
		}
	}

}
