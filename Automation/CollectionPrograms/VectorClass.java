package CollectionPrograms;

import java.util.Iterator;
import java.util.Vector;

public class VectorClass {

	public static void main(String[] args) {
		Vector v=new Vector();
		v.add(1234);
		v.add("ABCDE");
		v.add(4321);
		v.add("EDCBA");
		System.out.println(v);
		
		Vector v1=new Vector();
		v1.add(5678);
		v1.add("VWXYZ");
		System.out.println(v1);
		
		Iterator itr=v1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
