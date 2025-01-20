package demo;
import java.util.Scanner;
import java.util.Arrays;
public class Sort {
         public static void main(String args[])
         { int i;
        	int arr[]= {12,34,76,87,1,3,5} ;
        	for(i=0;i<arr.length;i++)
        	{
        		Arrays.sort(arr);	
        	 
        	}
        	for(i=0;i<arr.length;i++)
        	{
        	 System.out.print(arr[i] +" ");
        	}
         }
}
