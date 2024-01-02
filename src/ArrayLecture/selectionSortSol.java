package ArrayLecture;

public class selectionSortSol {
	
	public static int[] selectionSort(int[] arr) {
		int n = arr.length;
		for(int i = 0; i<n-1; i++) {
			int min = Integer.MAX_VALUE;
			int minIndx = -1;
			for(int j = i ; j < n ; j++) {
				if(arr[j] < min) {
					min = arr[j];
					minIndx = j;
				}
				int temp = arr[minIndx];
				arr[minIndx] = arr[j];
				arr[j 
				    ] = temp;
				
				
			}
		
		
		}
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {7,3,5,1,9};
	int[]res= 	selectionSort(arr);
	for(int i=0; i<res.length; i++) {
		System.out.print(res[i] + " ");
	}

	}

}
