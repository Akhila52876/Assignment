package demo;

public class Deleting_word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String s1="I am studying in Chaitanya engineering College";
         System.out.println("Original sentence:"+s1);
         String s2="studying";
         String words[]=s1.split(" ");
         String modifiedSentence="";
         for(int i=0;i<words.length;i++)
         {
        	 if(!words[i].equals(s2))
        	 {
                 if (!modifiedSentence.isEmpty()) {
                     modifiedSentence += " ";
                 }
                 modifiedSentence += words[i];

        	 }
         }
          System.out.print("Modified sentence :"+modifiedSentence);
         }

}
