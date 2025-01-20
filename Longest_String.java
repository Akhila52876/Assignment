package demo;

public class Longest_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stud
		    String s1=new String("I am studying in chaitanya engineering college");
		   System.out.println("The sentence  is:"+s1);
		    String c1[]=s1.split("\\s+");
		    String longestword=" ";
		    int maxlength=0;
		    for(String word:c1)
		    {
		       if(word.length()>maxlength)
		       {
		    	longestword=word;
		    	maxlength=word.length();
		       }
		    }
		    
		    System.out.println("The longest word is:"+longestword);
		    System.out.print("The number of word is:"+maxlength);

	}

}
