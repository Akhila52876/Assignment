package demo;

public class Commom_Elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int i,j,temp;
         int arr1[]= {1,4,7,9,8};
         int arr2[]= {3,9,1,8,6};
         int number1=arr1.length;
         int number2=arr2.length;
		 System.out.print("common elements :");

         for(i=0;i<number1;i++)
         {
             for(j=0;j<number2;j++)
             {
            	 if(arr1[i]==arr2[j])
            	 {
            		 temp=arr1[i];
            		 System.out.print(+temp +" ");

            	 }
             }
           
         }
         }

}
