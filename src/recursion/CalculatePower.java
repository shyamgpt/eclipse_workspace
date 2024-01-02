package recursion;

import java.util.Scanner;

public class CalculatePower {
	
	public static int Power(int x, int n) {
		if(x == 0 || n == 0) {
			return 1;
		}
		
		int smallOutput = Power(x, n-1);
		int finalOutput = x * smallOutput;
		return finalOutput;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of x");
		int x = s.nextInt();
		System.out.println("Enter the value of n");
		int n = s.nextInt();
	int res =	Power( x,  n);
	System.out.println(res);

	}

}
