package ArrayLecture;

import java.util.Scanner;

public class LinearSearchCode {
	
	public static int[] inputArray() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = s.nextInt();
		int[] arr = new int[n];
		System.out.print("Enter the array element");
		for(int i=0; i<arr.length; i++) {
			 arr[i] = s.nextInt();
		}
		return arr;
	}
	
	public static void printArray(int[] arr) {
		for(int i =0; i<arr.length; i++ ) {
			System.out.print(arr[i] + " ");
		}
	}
	
	
	public static int[] linearSearch(int []arr) {
		for(int i =0; i<arr.length-1; i++) {
			for(int j=0; j<arr.length; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			
		}
		return arr;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int [] arr = 	inputArray();
	int [] arr1 = linearSearch(arr);
	printArray(arr1);
	

	}

}
