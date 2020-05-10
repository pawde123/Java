package list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListToSet {

	public static void main(String[] args) {
		List al=new ArrayList();
		al.add(1);
		al.add(3);
		al.add(5);
		al.add(7);
		al.add(1);
		al.add(8);
		al.add(1);
		al.add(17);
		al.add(20);
		al.add(7);
		System.out.println("Arraylist is "+al);
		List al2=new ArrayList();
		Set set=new HashSet();
		for(Object obj:al)
		{
			if(set.add(obj))
			{
				set.add(obj);
			}
			else
			{
				al2.add(obj);
				return;
			}
		}
		System.out.println("the set is "+set);
		System.out.println("Array list of duplicates "+al2);
		
	}

}
