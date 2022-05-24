package CollectionPrograms;

import java.util.ArrayList;
import java.util.List;

public class CollectionProgram2 {

	public static void main(String[] args) {
		List<Integer>lst=new ArrayList<Integer>();
		lst.add(123);
		lst.add(456);
		lst.add(789);
		for(Integer integer : lst)
		{
		System.out.println(integer);
		}
	}

}
