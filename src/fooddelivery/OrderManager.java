package fooddelivery;

public class OrderManager {
	
	public Order createOrder(Food f) {
		return new Order(f);
	}
	
}
