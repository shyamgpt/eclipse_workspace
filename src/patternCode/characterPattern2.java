
package patternCode;

import java.util.Scanner;

public class characterPattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number");
		int n = s.nextInt();
		
		int i =1;
		while(i<=n) {
			int j =1;
			while(j<=n) {
//				char ithChar = (char)('A'+i-1);
				char ch = 'A';
				
				System.out.print(ch);
				ch=  (char) (ch+1);
				
				j = j+1;
			}
			
			System.out.println();
			i = i+1;
			
		}

	}

}
