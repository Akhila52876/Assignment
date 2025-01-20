package demo;

public class Right_rotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {12,14,18,16,30,28,34,56};
		System.out.println("Original array:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		int temp,i;
		int number=arr.length;
		temp=arr[number-1];
		for(i=number-1;i>0;i--)
		{
			arr[i]=arr[i-1];
		}
		arr[0]=temp;
		System.out.print("\nAfter right right rotation:");

		for(i=0;i<number;i++)
		{
			System.out.print(+arr[i]+ " ");
		}

	}

}
