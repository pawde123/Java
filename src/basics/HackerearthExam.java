package basics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

import org.testng.annotations.Test;

public class HackerearthExam {
//    public static void main(String args[] ) throws Exception {
    @Test	
	public void test(){
//        Scanner s = new Scanner(System.in);
//        String name = s.nextLine();                 // Reading input from STDIN
//        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
//        int testcase=s.nextInt();
        int testcase=2;
       
        for(int i=0;i<testcase;i++)
        {
//        	 int input=s.nextInt();
        	int input=15;
            for(int j=1;j<=input;j++)
            {
                if(j%3==0)
                {
                    System.out.println("Fizz");
                }
                else if(j%15==0)
                {
                    System.out.println("FizzBuzz");
                }
                else 
                {
                    System.out.println(j);
                }
            }

        }

    }
}
