package demo;
import java.util.Scanner;
public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int i,key,n,count=0;
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter the number of elments :");
          n=sc.nextInt();
          int arr[]=new int[n];
          System.out.print("Enter the elements :");
        		  for(i=0;i<n;i++)
        		  {
        			  arr[i]=sc.nextInt();
        		  }
         System.out.print("Enter the target value :");
           key=sc.nextInt();
              for(i=0;i<arr.length;i++)
              {
            	  if(arr[i]==key)
            	  {
            		  count++;
            		  break;
            	  }
              }
              if(count==1)
              {
              System.out.print("Element is found at "+i);
              }
              else {
            	  System.out.println("not found");
              }
       }

}
