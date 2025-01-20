package demo;
import java.util.Scanner;
public class Matrix {

	public static void main(String[] args) {
		 int i,j,sum=0;
		 Scanner sc=new Scanner(System.in);
		 System.out.print("Enter the elements :");
		 int a[][]=new int[3][3];
		 for(i=0;i<3;i++)
		 {
			 for(j=0;j<3;j++)
			 {
				 a[i][j]=sc.nextInt();
			 }
		 }
		 System.out.println("Matrix is:");
		 for(i=0;i<3;i++)
		 {
			 for(j=0;j<3;j++)
			 {
				System.out.print(a[i][j]+" ");
				if(i==j)
				{
					sum=sum+a[i][j];
				}
			 }
			  System.out.println();
		 }
		 System.out.print(" Sum of Diagonal of a matrix :"+sum);
		
	}
}


