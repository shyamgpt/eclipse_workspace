package patternCode;

import java.util.Scanner;

public class pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number");
		int n = s.nextInt();
		int p =1;
		int i =1;
		while(i<=n) {
			int j =1;
			while(j<=i) {
//				System.err.println(p);
				System.out.print(p);
				p = p+1;
				j =j+1;
				
			}
			
			System.out.println();
			i = i+1;
		}

	}

}
