package demo;
import java.util.Scanner;
public class Descending_order {
           public static void main(String args[])
           {
        	  int temp,i,j,number;
        	  Scanner sc=new Scanner(System.in);
        	  System.out.println("Enter the number of element:");
        	  number=sc.nextInt();
        	  int arr[]=new int[number];
        	  System.out.println("Enter the elements :");
        	  for(i=0;i<number;i++)
        	  {
        		  arr[i]=sc.nextInt();
        	  }
        	  for(i=0;i<number-1;i++)
        	  {
        		  for(j=0;j<number-i-1;j++)
        		  {
        			  if(arr[j]<arr[j+1])
        			  { 
        				  temp=arr[j+1];
        				  arr[j+1]=arr[j];
        				  arr[j]=temp;
        			  }
        				  
        		  }
        	  }
        	  System.out.print("Sorted array in Descending order:");
        	  for(i=0;i<number;i++)
        	  {
        		   System.out.print(+ arr[i]+" ");
        		  }
        	  
        	  }
}
