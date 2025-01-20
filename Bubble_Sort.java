package demo;
import java.util.Scanner;
public class Bubble_Sort {
          public static void main(String args[]) {
        	  int i,j,numbers,temp;
        	  Scanner sc=new Scanner(System.in);
        	  System.out.print(" enter the number of elements :");
        	  numbers=sc.nextInt();
        	  int arr[]=new int[numbers];
        	  System.out.print("enter the elements");
        	  for(i=0;i<numbers;i++)
        	  {
        		  arr[i]=sc.nextInt();
        	  }
        	  for(i=0;i<numbers-1;i++)
        	  {
  
        		  for(j=0;j<numbers-i-1;j++)
        		  {
        			if(arr[j]>arr[j+1])
        			{
        				temp=arr[j];
        				arr[j]=arr[j+1];
        				arr[j+1]=temp;
        				
        			}
        		  }
        	  }
        		  System.out.print("Sort elements are :");
        		  for(i=0;i<numbers;i++)
        		System.out.print(arr[i] + " "); 
        	  }
}
