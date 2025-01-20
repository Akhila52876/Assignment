package demo;
import java.util.Scanner;
public class Fibonacci_Series {
	public static void main(String args[])
	{
		int result;
   Scanner sc=new Scanner(System.in);
   System.out.print("Enter the number to stop :");
   int number=sc.nextInt();
   System.out.print("enter the first number:");
   int first=sc.nextInt();
   System.out.print("enter the second number:");
   int second=sc.nextInt();
   System.out.print("Fibonacci Series :");
   for(int i=0;i<number;i++)
   {
	   result=first+second;
	   first=second;
	   second=result;
	   System.out.print(result +" ");
   }
   }
}
