package collections;

import java.util.HashMap;

public class Customer {
	  HashMap<String,Integer> order=new HashMap<String,Integer>();   
	    Customer()
	    {
	    	order.put("idli", 4);
	    	order.put("poori", 2);
	    	order.put("vada", 5);
	    }
	    void orderdisplay()
	    {
	    	System.out.println("");
	    	System.out.println("Order:");
	    	System.out.println(order.entrySet());
	    }
	    boolean addOrder(String food)
	     {
	    	 if(order.containsKey(food))
	    	 {
	    		 return true;
	    	 }
	    	 else
	    	 {
	    		 System.out.println("");
	    		 System.out.println("Item not present");
	    		 return false;
	    	 }
	     }
	    public void removeOrder()
	    {
	       order.clear();
           System.out.println(" ");
	       System.out.println("Order cancelled succesfully");
	    }
}
