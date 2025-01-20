package demo;

public class Add_two_matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[][]= {{12,45,34},{10,20,30},{67,85,43}};
         int arr1[][]= {{13,14,16},{34,41,47},{50,40,90}};
         System.out.println("Matrix is:");
         for(int i=0;i<arr.length;i++)
         {
       	  for(int j=0;j<arr.length;j++)
       	  {
       		  System.out.print(arr[i][j]+" ");
       	  }
       	   System.out.println();
         }
          
          //Second matrix
          
          System.out.println("Second Matrix is:");
          for(int i=0;i<arr1.length;i++)
          {
 	           for(int j=0;j<arr1.length;j++)
 	           {
 		            System.out.print(arr1[i][j]+" ");
 	            }
 	       System.out.println();
          }
          
          //adding two matrix
          
          System.out.println("Adding of two matrix:");
          for(int i=0;i<arr.length;i++)
          {
        	  for(int j=0;j<arr.length;j++)
        	  {
        		  System.out.print(arr[i][j]+arr1[i][j]+" ");
        	  }
        	  System.out.println();
          }
	}
}
	     
    
    


