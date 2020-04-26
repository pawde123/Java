package stringsPractice;

public class FetchOnlyNumbersFromString {

	public static void main(String[] args) {
	String s="1121wkjdnjfkjf";
	String s1=s.replaceAll("[^0-9]", "");
	System.out.println(s1);
	}

}
