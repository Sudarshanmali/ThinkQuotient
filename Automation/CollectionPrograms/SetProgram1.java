package CollectionPrograms;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetProgram1 {

	public static void main(String[] args) {
		Set<String> s=new HashSet<String>();
		s.add("Pune");
		s.add("Mumbai");
		s.add("Delhi");
		s.add("Benglore");
		s.add("Chennai");
		s.add(null);
		System.out.println(s);
		
		Iterator itr=s.iterator();	
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
