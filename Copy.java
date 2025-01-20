package demo;
public class Copy {
	 public static void main(String args[])
     { 
		 int temp;
   	  int arr1[]= {2,5,7,8,9,10};
   	  int n=arr1.length;
   	System.out.print("Original array : ");
   	  for(int i=0;i<n;i++)
   	  {
   	  System.out.print(+arr1[i]+ " ");
   	  }
   	  int arr2[]=new int[n];
   	  System.out.println("\ncopying elements to another array :");
   	  for(int i=0;i<n;i++)
   	  {
   	     arr2[i]=arr1[i];
   	     temp=arr2[i];
   	  System.out.print(temp+" ");
   	  }
   	
     }
}
   	
