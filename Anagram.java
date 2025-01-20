package demo;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            String s1= new String("visa");
            boolean isEqual=true;
            String s2="europe";
            char c1[] =s1.toCharArray();
            char c2[] =s2.toCharArray();           	
            if(s1.length()==s2.length())
            {
            	Arrays.sort(c1);
            	Arrays.sort(c2);
            	for(int i=0;i<s1.length();i++)
            	{
            		if(c1[i]==c2[i])
            		{
            			isEqual=true;
            		}
            		else
            		{
                         isEqual=false;
            		}
            	}
            }
            	else
            	{
            		isEqual=false;
            	System.out.println("Not anagram ");
            	}
            if(isEqual)
            {
            	System.out.print("It is Anagram :"+s1+ " --> "+s2);
            }
            else
            {
            	System.out.print("It is not Anagram :"+s1+ " --> "+s2);

            }
	}

}
