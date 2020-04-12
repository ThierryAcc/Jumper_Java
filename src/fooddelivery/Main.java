package fooddelivery;

public class Main {

	public static void main(String[] args) {
		
		Food f1 = new Food("Calzone", 10, FoodCategories.PIZZA);
		Food f2 = new Food("Margherita", 8, FoodCategories.PIZZA);
		Food f3 = new Food("Spaghetti Carbonara", 9, FoodCategories.PASTA);
		Food f4 = new Food("Grünzeugs", 5, FoodCategories.SALAD);
		Food[] foods = {f1,f2,f3,f4};
		
		OrderManager orderManager = new OrderManager();
		Order o1 = orderManager.createOrder(f1);
		Order o2 = orderManager.createOrder(f2);
		Order o3 = orderManager.createOrder(f3);
		Order o4 = orderManager.createOrder(f4);
				
		System.out.println(o1.toString());
		System.out.println(o1.getFood());
		
		try {
			o1.next();
			o2.next();
			o3.next();
			o4.next();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
