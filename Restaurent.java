package collections;

import java.util.*;

public class Restaurent extends Customer {
     private String name;
     int total=0;
     HashMap<String,Integer> menu=new HashMap<String,Integer>();   
    
     //adding items
     Restaurent()
     {
         menu.put("idli",20);
         menu.put("dosa",10);
         menu.put("vada",15);
         menu.put("poori",15);
     }
     
     void dispaly()
     {
    	 Set<String> food=menu.keySet();
    	 System.out.println("");
    	System.out.println("Items available in menu and price :");
    	for(String f:food)
    	{
    		System.out.println(f +" "+menu.get(f));
    	}
     }
     
     void Bill()
     {
    	 System.out.println("");
    	 System.out.println("The total Bill");
    	 Set<String> bill=order.keySet();
    	 for(String x:bill)
    	 {   int sum;
    		 sum=menu.get(x)*order.get(x);
    		 total+=sum;
    		 System.out.println(sum);
    		 
    	 }
    	 System.out.println("");
    	 System.out.println("total food price:"+total);
     }
    boolean addMenu(String food,int price)
    {
    	if(menu.containsKey(food))
    	{
    		System.out.println("");
    		System.out.print("Item present in menu");
    		return true;
    	}
    	else
    	{
    		System.out.println("");
    		System.out.println("Item added in menu:");
    	    System.out.println( food +" "+price );
    	    menu.put(food,50);
    	    return false;
    	}
    }
    public void removeItem(String item)
    {
       menu.remove(item);
    }
}
