package demo;

public class STBC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   //Typecasting
		
             int b=121;
             System.out.println(" Before Typecasting:"+b);
             float a=(int)b;
             System.out.println("After Typecasting:"+a);
             
             //break
             
             int n=100,c=30;
             System.out.println("Using break:");
             for(int i=0;i<n;i++)
             {
            	 if(i==c)
                   break;
            	 System.out.print(i+" ");
             }
            //continue
             
             int k=40,l=30;
             System.out.print("\nUsing continue:");
             for(int i=0;i<k;i++)
             {
            	 if(i==l)
                   continue;
            	 System.out.print(i +" ");
             }
             
             //Switch
             int day=3;
             System.out.println("\nUsing switch :");
             switch(day)
             {
             case 1: 
            	 System.out.println("Monday");
             case 2: 
            	 System.out.println("Tuesday");
             case 3: 
            	 System.out.println("Wednesday");
             case 4: 
            	 System.out.println("Thursday");
             case 5: 
            	 System.out.println("Friday");
             case 6: 
            	 System.out.println("Saturday");
             case 7: 
            	 System.out.println("Sunday");
            default :
            	System.out.println("not valid");
             }
             
	}

}
