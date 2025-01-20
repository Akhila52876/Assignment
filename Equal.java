package demo;

public class Equal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    int i,j;
		    boolean Equal=false;
            int arr1[]= {2, 6, 7, 8,9};
            int arr2[]= {7,9,2,6,1};
            for(i=0;i<arr1.length;i++)
            {
                for(j=0;j<arr2.length;j++)
                {
                	if(arr1.length==arr2.length && arr1[i]==arr2[j])
                	{
                	    Equal=true;
                	}
                	else
                	{
                		Equal=false;
                	}
                }

            }
    		 System.out.print(Equal);       	
	}

}
