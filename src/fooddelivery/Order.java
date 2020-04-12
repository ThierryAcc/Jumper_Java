package fooddelivery;

public class Order {
	Food food;
	OrderState state = OrderState.ORDERED;
	
	public Order(Food food) {
		this.food = food;
		this.state = OrderState.ORDERED;
	}

	public void next() throws InterruptedException {
		System.out.println("State: " + this.state.ORDERED + " " + this.getFood().getName());
		Thread.sleep((long) (1000+Math.random()*3000));
		System.out.println("State: " + this.state.DELIVERY + " " + this.getFood().getName());
		Thread.sleep((long) (1000+Math.random()*3000));
		System.out.println("State: " + this.state.COMPLETED + " " + this.getFood().getName());
	}

	@Override
	public String toString() {
		return "Order [food=" + food + ", state=" + state + "]";
	}

	public Food getFood() {
		return food;
	}

	public void setFood(Food food) {
		this.food = food;
	}

	public OrderState getState() {
		return state;
	}

	public void setState(OrderState state) {
		this.state = state;
	}
	
	
}
