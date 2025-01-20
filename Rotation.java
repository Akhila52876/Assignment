package demo;

public class Rotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //left rotation
		  int temp,i;
          int arr1[]= {34,78,90,12,45};
          System.out.print("original array:");
          for(i=0;i<arr1.length;i++)
          {
        	System.out.print(arr1[i] +" ");  
          }
          int number=arr1.length;
          temp=arr1[0];
          for(i=0;i<number-1;i++)
          {
        	 arr1[i]=arr1[i+1];
          }
          arr1[number-1]=temp;
          System.out.print("\nAfter left rotation of an array:");
          for(i=0;i<number;i++)
          {
          System.out.print(+arr1[i]+" ");
          }
         
	}

}
