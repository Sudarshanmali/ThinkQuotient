package CollectionPrograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collectionprogram3 {

	public static void main(String[] args) {
		List lst=new ArrayList();
		System.out.println(lst.isEmpty());
		lst.add(753);
		lst.add("Java");
		lst.add(951);
		lst.add('Z');
		//System.out.println(lst);
			Iterator itr= lst.iterator();	
			while(itr.hasNext())
			{
			Object obj=itr.next();
			System.out.println(obj);
			}
		}
}
