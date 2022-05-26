package CollectionPrograms;

import java.util.Enumeration;
import java.util.Vector;

public class VectorClass1 {

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
		 
			Enumeration en=v1.elements();
			while(en.hasMoreElements())
			{
				System.out.println(en.nextElement());
			}
	}

}
