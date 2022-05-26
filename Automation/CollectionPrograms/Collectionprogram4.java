package CollectionPrograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Collectionprogram4 {

	public static void main(String[] args) {
		List<String> lst=new ArrayList();
		lst.add("Java");
		lst.add("Python");
		lst.add("C++");
		lst.add("C");
		System.out.println(lst);
			Iterator<String> itr= lst.iterator();
			while(itr.hasNext())
			{
				String s=itr.next();
				System.out.println(s);
				itr.remove();
			}
			System.out.println(lst.isEmpty());
		
	}
}
