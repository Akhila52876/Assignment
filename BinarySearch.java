package demo;
import java.util.Scanner;
public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int low=0,mid=-1,key,i;
         boolean found=false;
          Scanner sc=new Scanner(System.in);
          System.out.print("Enter the number of elements :");
          int n=sc.nextInt();
          int arr[]=new int[n];
          int high=n-1;
          System.out.println("Enter the sorted array:");
             for(i=0;i<n;i++)
          {
        	 arr[i]=sc.nextInt();
          }
          System.out.println("Enter the target value :");
          key=sc.nextInt();
          while(low<=high)
          {
        	  mid=(low+high)/2;
        	  if(arr[mid]==key)
        	  {
        		  found=true;
        		  break;
        	  }
        	  else if(arr[mid]<key)
        		  {
        			 low=mid+1; 
        		  }
        		  else
        		  {
        			  high=mid-1;
        		  }        	    
          }
         if(found==true)
         {
        	 System.out.println("Element is found" +mid);
         }
         else
         {
        	 System.out.println("Element is not found");
         }
	}

}
