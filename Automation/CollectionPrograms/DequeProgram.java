package CollectionPrograms;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeProgram {

	public static void main(String[] args) {
		Deque d=new ArrayDeque();
		d.add(3);
		d.add(16);
		d.add(98);
		d.add(35);
		d.add(42);
		d.add(22);
		System.out.println(d);
		System.out.println(d.getFirst());
		System.out.println(d.getLast());
		
		System.out.println(d.removeFirst());
		System.out.println(d);
	}

}
