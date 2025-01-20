package demo;
import java.util.Scanner;
public class Factorial {
    public static void main(String args[])
    {
        float result=1;
    	Scanner sc=new Scanner(System.in);
    	System.out.print("Enter number:");
    	int number=sc.nextInt();
    	for(int i=0;i<number;i++)
    	{
    		result =result*(number-i);
    	}
    	System.out.print("factorial number:" +result);
    }
}
