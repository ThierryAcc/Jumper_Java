package generics;

import inheritance.Animal;

// Der Erzeuger eines Objekts kann festlegen, was er für einen Typ möchte
public class BoxExtends<T extends Animal> {
	private T element;
	
	public BoxExtends() {
		super();
	}

	public BoxExtends(T element) {
		this.element = element;
	}

	public T getElement() {
		return element;
	}

	public void setElement(T element) {
		this.element = element;
	}
	
}
