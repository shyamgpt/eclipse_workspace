package patternCode;

import java.util.Scanner;

public class pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = s.nextInt();
		int i = 1;
		while(i<=n) {
			int j = 1;
			while(j<=i) {
				int p =i;
				System.out.print(j);
				j = j+1;
			}
			
			System.out.println();
			 i =i+1;
			
		}
		
		
	}

}
