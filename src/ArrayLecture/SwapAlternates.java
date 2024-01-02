package ArrayLecture;

import java.util.Scanner;

public class SwapAlternates {
	
	public static int[] InputArray() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = s.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the array Element");
		for(int i=0; i<arr.length; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
		
	}
	
	public static int[] Swap(int[] arr1) {
		for(int i=0; i<arr1.length; i=i+2) {
			
				int temp = arr1[i+1];
				arr1[i+1] = arr1[i];
				arr1[i] = temp;
			
			
		}
		return arr1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int[] IpArr =	InputArray();
	int[] ResArr = Swap(IpArr);
	for(int i =0; i< ResArr.length; i++) {
		System.out.print(ResArr[i] + " ");
	}
	

	}

}
