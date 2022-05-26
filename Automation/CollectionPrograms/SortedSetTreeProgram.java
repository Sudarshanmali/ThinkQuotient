package CollectionPrograms;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetTreeProgram {

	public static void main(String[] args) {
		SortedSet s=new TreeSet();
		s.add(12);
		s.add(45);
		s.add(78);
		s.add(32);
		s.add(65);
		System.out.println(s);
		System.out.println(s.headSet(45));
		System.out.println(s.subSet(32, 65));
		System.out.println(s.tailSet(65));
	}

}
