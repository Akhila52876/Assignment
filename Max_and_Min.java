package demo;
public class Max_and_Min {
     public static void main(String args[])
     {
    	 int arr[]= {23,56,78,12,90};
    	 int max=arr[0];
    	 int min=arr[0];
    	 for(int i=0;i<arr.length;i++)
    	 {
    		if(arr[i]>max)
    		{
    			max=arr[i];
    		}
    		if(arr[i]<min)
    		{
    			min=arr[i];
    		}
    	 }
    	 System.out.print("Maximium number is :"+max);
    	 System.out.print("\nMinimium number is :"+min);
    	 
     }
}
