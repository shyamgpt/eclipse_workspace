package patternCode;

import java.util.Scanner;

public class pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number");
		int n = s.nextInt();
		
		int i =1;
		
		while(i<=n) {
			int j =1;
			while(j<=n) {
				System.out.print("*");
				j = j+1;
			}
			
			i = i+1;
			System.out.println();

			
			
		}
		
		
	}

}
