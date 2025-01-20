package demo;

public class MatrixEqual_NOt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		boolean isEqual=true;
		 int arr[][]=  {{13,14,16},{34,41,47},{50,40,90}};//{{12,45,34},{10,20,30},{67,85,43}};
         int arr1[][]= {{13,14,16},{34,41,47},{50,40,90}};
         System.out.println("Matrix is:");
         for( i=0;i<arr.length;i++)
         {
       	  for( j=0;j<arr.length;j++)
       	  {
       		  System.out.print(arr[i][j]+" ");
       	  }
       	   System.out.println();
         }
          
          //Second matrix
          
          System.out.println("Second Matrix is:");
          for( i=0;i<arr1.length;i++)
          {
 	           for( j=0;j<arr1.length;j++)
 	           {
 		            System.out.print(arr1[i][j]+" ");
 	            }
 	       System.out.println();
          }
          if(arr.length!=arr1.length||arr[0].length!=arr1[0].length)
          {
        	isEqual=false;  
          }
          else
          {
        	  for(i=0;i<arr.length;i++)
        	  {
        		  for(j=0;j<arr.length;j++)
        		  {
        			  if(arr[i][j]!=arr1[i][j])
        			  {
        	        	  isEqual=false;
        	        	  break;
        			  }
        		  }
        		  if(!isEqual)
        			  break;
        	  }	  
          }
          if(!isEqual)
          {
        	  System.out.print("Two matrix are not equal");
          }
          else
        	  System.out.print("Two matrix are equal");

	}

}
