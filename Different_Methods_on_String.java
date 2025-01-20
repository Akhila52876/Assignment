package demo;

public class Different_Methods_on_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Substring method
		String s1="I am located in Visakhapatnam";
		String x1=s1.substring(4, 11);
		System.out.println("SUBSTRING IS:"+x1);
		// split method
		String x2[]=s1.split("//s+ ");
		System.out.println("After spliting:");
		for(int i=0;i<x2.length;i++)
		{
			System.out.print(x2[i]);
		}
		//charAt
          char x3=s1.charAt(13);
          System.out.print("Char at:"+x3);
	}

}
