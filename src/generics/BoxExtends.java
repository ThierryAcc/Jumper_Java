package generics;

import inheritance.Animal;

// Der Erzeuger eines Objekts kann festlegen, was er f�r einen Typ m�chte
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
