package demo;

public class Duplicate_word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             String s1[]= {	"apple","pineapple","grapes"," banana","pineapple"};
             for(int i=0;i<s1.length;i++)
             { 
            	 for(int j=i+1;j<s1.length;j++)
            	 if(s1[i].equalsIgnoreCase(s1[j]))
            	 {
            		 System.out.print("Duplicate word is:"+s1[i]);
            	 }
             }
	}

}
