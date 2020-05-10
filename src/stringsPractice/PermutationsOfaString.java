package stringsPractice;

public class PermutationsOfaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findPermutations("ABC", ""));
	}
	
	public static String findPermutations(String str,String ans)
	{
	if(str.length()==0||str.equals(""))
	{
		System.out.println("No String entered");
	}
	else
	{
		for(int i=0;i<str.length()-1;i++)
		{
			char ch=str.charAt(i);
			ans=str.substring(i+1);
			String str1=str.substring(0,i)+ans;
			findPermutations(str1, ch+ans);
		}
		System.out.println("The Permutations are "+ans);
	}
	return ans;
	
		}

}
