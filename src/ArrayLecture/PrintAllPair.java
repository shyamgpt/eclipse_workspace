package ArrayLecture;

public class PrintAllPair {
	
	public static void printPair(int[] arr) {
		for(int i =0; i<arr.length-1; i++) {
			for(int j=i+ 1; j<arr.length; j++) {
				System.out.print("(" + arr[i] + "," + arr[j]+ ")");
				
			}
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,3,4,1,9};
		printPair(arr);

	}

}
