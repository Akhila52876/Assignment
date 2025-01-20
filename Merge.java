package demo;
import java.util.Arrays;
import java.util.ArrayList;
public class Merge {
          public static void main(String args[])
          {  
        	  int arr1[]= {2,5,7,8,9,10};
        	  int arr2[]= {20,30,40,50,60};
        	  ArrayList<Integer>list1=new ArrayList<>();
        	  ArrayList<Integer>list2=new ArrayList<>();
        	  for(int num :arr1)
        	  {
        		  list1.add(num);
        	  }
        	  for(int num :arr2)
        	  {
        		  list2.add(num);
        	  }
             list1.addAll(list2);
             System.out.print("After Merge :"+ list1);
          }
}
