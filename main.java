package collections;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Restaurent restaurent=new Restaurent();
          Customer customer=new Customer();
          restaurent.dispaly();
          customer.orderdisplay();
          restaurent.Bill();
          customer.addOrder("pizza");
          restaurent.addMenu("pizza", 50);
          restaurent.dispaly();
          restaurent.removeItem("idli");
          restaurent.dispaly();
          customer.removeOrder();
          customer.orderdisplay();
	}

}
