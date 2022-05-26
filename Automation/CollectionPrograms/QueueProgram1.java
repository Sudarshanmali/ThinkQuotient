package CollectionPrograms;

import java.util.LinkedList;
import java.util.Queue;

public class QueueProgram1 {

	public static void main(String[] args) {
		Queue q=new LinkedList();
		
		System.out.println(q.offer("ThinkQuotient"));
		System.out.println(q.peek());
		System.out.println(q);
		System.out.println(q.poll());
		System.out.println(q);
	}

}
