package ArrayLecture;

public class BinarySearch {
	
	public static int binarySrch(int []arr, int elem) {
		int s = 0;
		int e = arr.length-1;
		
		while(s<=e) {
			int mid = (s+e)/2;
			if(arr[mid] > elem) {
				e = mid-1;
			}else if(arr[mid] <elem) {
				s = mid+1;
			} else {
				return mid;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {4,5,6,7,8};
		int elem = 5;
	int res =	binarySrch(arr,elem);
	System.out.println(res);
		

	}

}
