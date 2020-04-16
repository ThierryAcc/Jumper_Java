package inheritance;

public class Collar {
	private String color;
	private int size;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public Collar(String color, int size) {
		super();
		this.color = color;
		this.size = size;
	}

	@Override
	public String toString() {
		return "Collar [color=" + color + ", size=" + size + "]";
	}
}
