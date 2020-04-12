package fooddelivery;

public class Food {
	String name;
	int price;
	FoodCategories category;
	
	public Food(String name, int price, FoodCategories category) {
		super();
		this.name = name;
		this.price = price;
		this.category = category;
	}

	@Override
	public String toString() {
		return "Food [name=" + name + ", price=" + price + ", category=" + category + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public FoodCategories getCategory() {
		return category;
	}

	public void setCategory(FoodCategories category) {
		this.category = category;
	}

	
}
