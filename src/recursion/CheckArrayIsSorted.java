package recursion;

public class CheckArrayIsSorted {
	
	public static boolean isSorted(int[] a) {
		if(a.length ==1) {
			return true;
		}
		if(a[0] > a[1]) {
			return false;
		}
		 int smallArray[] = new int[a.length-1];
		 for(int i =1; i<a.length; i++) {
			 smallArray[i-1] = a[i];
			 
		 }
		  boolean isSmallArraySorted = isSorted(smallArray);
		  return isSmallArraySorted;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4,6,7,8,9};
		boolean res = isSorted(arr);
		System.out.println(res);

	}

}
