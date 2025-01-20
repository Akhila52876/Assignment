package demo;

public class Palindrome {
               public static void main(String args[])
               {
            	   int number=133;
            	   int digits,temp=number,reversed=0;
                   while(number>0)
                   {
                	   digits=number%10;
                	   reversed=reversed*10+digits;
                	   number/=10;
                   }
            	   if(temp==reversed)
            	   {
            		   System.out.print("number is palindrome:"+temp);
            	   }
            	   else
            	   {
            		   System.out.print("number is  not palindrome :"+temp);
            	   }

                 
               }
}
