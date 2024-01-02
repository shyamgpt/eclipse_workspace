package recursion;

public class ArraySortedAdvanceMethod {
	
	public static boolean isSorted(int[] a, int si) {
		if(si == a.length -1) {
			return true;
		}
		 if(a[si] > a[si+1]) {
			 return false;
		 }
		 
		 
		boolean isSmallArraySorted =  isSorted(a, si+1);
		return isSmallArraySorted;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {5,7,8,9};
		int si = 0;
		boolean res = isSorted( a,  si);
		System.out.println(res);

	}

}
