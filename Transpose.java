package demo;

public class Transpose {
          public static void main(String args[])
          { 
        	  int arr[][]= {{12,45,34},{10,20,30},{67,85,43}};
              System.out.println("Matrix is:");
              for(int i=0;i<arr.length;i++)
              {
            	  for(int j=0;j<arr.length;j++)
            	  {
            		  System.out.print(arr[i][j]+" ");
            	  }
            	   System.out.println();
              }
              
              //Transpose 
              System.out.println("Transpose Matrix:");
              for(int j=0;j<arr.length;j++)
              {
            	  for(int i=0;i<arr.length;i++)
            	  {
            		  System.out.print(arr[i][j]+" ");
            	  }
            	  System.out.println();
              }
          }
}
