package ArrayLecture;

public class bubbleSortSol {
	
	public static void printArray(int []arr) {
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void bubbleSort(int[] arr) {
		int n = arr.length;
		for(int i =0; i<n-1; i++) {
			for(int j =0; j<n-1-i; j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j+1];
					arr[j+1]= arr[j];
					arr[j] = temp;
				}
			}
		}
		//return arr;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,7,4,3,9,2,6};
		 bubbleSort(arr);
		//printArray(arr1);
		printArray(arr);

	}

}
