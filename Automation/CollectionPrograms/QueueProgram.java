package CollectionPrograms;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueProgram {

	public static void main(String[] args) {
		Queue q=new PriorityQueue();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		System.out.println(q);
			Iterator itr=q.iterator();
			while(itr.hasNext())
			{
				System.out.println(itr.next());
				
				itr.remove();
			}
			System.out.println(q);
	}

}
