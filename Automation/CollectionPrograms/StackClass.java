package CollectionPrograms;

import java.util.Stack;

public class StackClass {

	public static void main(String[] args) {
		Stack s=new Stack();
		s.add(1234);
		s.add("ABC");
		s.add(5678);
		s.add("XYZ");
		System.out.println(s);
		s.pop();
		System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s.push("PQR"));
	}

}
