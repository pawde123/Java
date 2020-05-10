package list;
import java.util.ArrayList;
import java.util.List;


public class ArrayListbasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List al=new ArrayList(); 
		al.add("sample");
		System.out.println(al);
		System.out.println(al.add("Checking add method"));
		System.out.println(al.add("Checking add method"));
		List al2=new ArrayList();
		System.out.println(al2.addAll(al));
		System.out.println(al2);
	}

}
