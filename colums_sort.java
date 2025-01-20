package demo;

public class colums_sort {
           public static void main(String args[])
           {    
        	   int i,j,temp;
        	   int arr1[][]= {{23,56,78},{89,54,45},{12,42,34},{46,67,87}};
        	   System.out.println("Matrix is :");
        	   for(i=0;i<arr1.length;i++)
        	   {
        		  for(j=0;j<arr1[i].length;j++)
                      {
                         System.out.print(arr1[i][j] +" ");
                       }
           	   System.out.println();
                  }
        	   // sorting the columns
        	   for(j = 0; j < arr1[0].length; j++)
        	   { 
                   for(i = 0; i < arr1.length - 1; i++) 
                   { 
                       for(int m = i + 1; m < arr1.length; m++)
                       { 
                           if(arr1[i][j] > arr1[m][j]) { 
                               temp = arr1[i][j];
                               arr1[i][j] = arr1[m][j];
                               arr1[m][j] = temp;
                           }
                       }
                   }
               }

               System.out.println("\nMatrix After Sorting Columns:");
               for(i = 0; i < arr1.length; i++) 
               {
                   for(j = 0; j < arr1[i].length; j++)
                   {
                       System.out.print(arr1[i][j] + " ");
                   }
                   System.out.println();
               }
        	   }
           }

	