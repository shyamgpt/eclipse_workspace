package stackDS;

public class StackUse {

	public static void main(String[] args) throws StackFullException, StackEmptyException {
		// TODO Auto-generated method stub
		
//		StackUsingArrayWithExcecption stack = new StackUsingArrayWithExcecption();
		PracticeStackUsingArray stack = new PracticeStackUsingArray();
		stack.push(20);
		System.out.println(stack.size());
		stack.pop();
		System.out.println(stack.size());
//		System.out.println(stack.top());
//		stack.pop();
//		stack.size();
//		System.out.println(stack.isEmpty());
//		
		
		
		

	}

}
