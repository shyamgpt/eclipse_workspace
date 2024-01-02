package ArrayLecture;

import java.util.Scanner;

public class PrintNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = s.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = i+1;
			System.out.print(arr[i] + " ");
		}
		

	}

}
