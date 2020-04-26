package basics;

public class CountofSmallandCapitalCase {

	static String s="SomthingISFishing";
	char ch;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountofSmallandCapitalCase csvb=new CountofSmallandCapitalCase();
		csvb.countofSmallAndCapital(s);
	}
	public void countofSmallAndCapital(String str)
	{
		int uppercase=0,lowercase=0;
        for(int i=0;i<str.length();i++)
        {
            ch = str.charAt(i);
            int asciivalue = (int)ch;
            if(asciivalue >=65 && asciivalue <=90){
                uppercase++;
            }
            else if(asciivalue >=97 && asciivalue <=122){
                lowercase++;
            }
        }
        System.out.println("No of lowercase letter : " + lowercase);
        System.out.println("No of uppercase letter : " + uppercase);	}

}
