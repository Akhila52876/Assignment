package demo;
import java.util.Scanner;
public class Largest_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int i,temp;
         Scanner sc=new Scanner(System.in);
         System.out.print("Enter the number of elments:");
         int number=sc.nextInt();
         int arr[]=new int[number];
         System.out.print("Enter the elments:");
         for(i=0;i<number;i++)
         {
        	 arr[i]=sc.nextInt();
         }
         temp=arr[0];
         for(i=0;i<arr.length;i++)
         {
        	 if(arr[i]>temp)
        	 {
        		 temp=arr[i];
        	 }
         }
         System.out.println("Largest number is :"+temp);
	}

}
