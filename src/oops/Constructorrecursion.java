package oops;

public class Constructorrecursion {
	
	public Constructorrecursion()
	{
		this();
		System.out.println("Constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main-method");
//		Constructorrecursion cr=new Constructorrecursion();
	}

}
