package recursion;

import java.util.Scanner;

public class FactorialOfNum {
	
	
	public static int fact(int n) {
		if(n == 0) {
			return 1;
		}
		
		int smallOutput = fact(n-1);
		int finalOutput = n* smallOutput;
		return finalOutput;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number for which you want to finf factorial");
		int n = s.nextInt();
		
		int ans = fact( n);
		System.out.println(ans);

	}

}
