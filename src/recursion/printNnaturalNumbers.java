package recursion;

public class printNnaturalNumbers {
	
	
	public static void print1ton(int n) {
		if(n==0) {
			return;
		}
		print1ton(n-1);
		System.out.println(n);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print1ton( 5);

	}

}
