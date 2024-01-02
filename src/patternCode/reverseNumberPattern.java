package patternCode;

import java.util.Scanner;

public class reverseNumberPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number");
		int n = s.nextInt();
		
		int i = 1;
		int p = 1;
		while(i<=n) {
			 p =i;
			int j =1;
			while(j<=i) {
				
				System.out.print(p);
				p = p-1;
				j = j+1;
			}
			i = i+1;
			System.out.println();
		}
				

	}

}
