package demo;

public class Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         //Armstrong_number
		 int sum=0,number=153,digits,temp;
		 int Originalnumber=number;

		 digits=String.valueOf(number).length();
		
		 while(number>0)
		 {
			 temp=number%10;
			 sum+=Math.pow(temp,digits);
			 number=number/10;
		 }
		 if(sum==Originalnumber)
		 {
			 System.out.println("Armstrong number is :"+sum);
		 }
		 else {
			 System.out.println(" Not Armstrong number :"+sum);
		 }
	}

}
