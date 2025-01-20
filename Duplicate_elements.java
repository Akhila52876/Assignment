package demo;
import java.util.Scanner;
public class Duplicate_elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	            int i,j,k=0;
		        Scanner scanner = new Scanner(System.in); 
		        System.out.print("Enter the number of elements in the array: ");
		        int n = scanner.nextInt();

		        
		        int[] arr = new int[n];
		        System.out.println("Enter the elements of the array:");
		        for ( i = 0; i < n; i++) {
		            arr[i] = scanner.nextInt();
		        }

		        
		        int[] temp = new int[n];
		        for ( i = 0; i < n; i++) {
		        	boolean Duplicate=false;
		            for (j = 0; j < k; j++) {
		                if (arr[i] == temp[j]) {
		                    Duplicate = true;
		                    break;
		                }
		            }
		            if (Duplicate==false) {
		                temp[k] = arr[i];
		                k++;
		            }
		        }

		        
		        System.out.println("Array after removing duplicates:");
		        for ( i = 0; i < k; i++) {
		            System.out.print(temp[i] + " ");
		        }

		        
		    }
		

	}


