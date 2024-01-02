package recursion;

import java.util.Scanner;

public class SumOfNnaturalNumbers {
	
	public static int sumN(int n) {
		if(n==0) {
			return 0;
		}
		
		int smallOutput = sumN(n-1);
		int finalOutput = n + smallOutput;
		//System.out.println(finalOutput);
		return finalOutput;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = s.nextInt();
		int res = sumN(n);
		//System.out.println(res);

	}

}
