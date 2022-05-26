package CollectionPrograms;

import java.util.LinkedList;

public class LinkedListProgram {

	public static void main(String[] args) {
		LinkedList lnklst=new LinkedList();
		lnklst.add("Java");
		lnklst.add("C++");
		lnklst.add("C");
		lnklst.add("Python");
		System.out.println(lnklst);
		System.out.println(lnklst.getLast());
		System.out.println(lnklst.getFirst());
		
		lnklst.offer("JavaScript");
		System.out.println(lnklst.getLast());
	}

}
