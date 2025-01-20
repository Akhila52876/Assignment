package demo;

public class Reverse {
            public static void main(String args[])
            {
            	int reverse,number=567,count=0,digits,sum=0;
            	System.out.println(" Original number is:"+number);
        		System.out.print("reverse number:");

            	while(number>0)
            	{
            		digits=number%10;
            		count++;             //counting the numbers
            		sum+=digits;         //Sum of digits
            		System.out.print(+digits);
            		number/=10;
            	}
        		System.out.println("\nSum of numbers:"+sum);
        		System.out.print("Count of the numbers:"+count);

            }
}
