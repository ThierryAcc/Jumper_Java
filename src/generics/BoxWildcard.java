package generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Der Erzeuger eines Objekts kann festlegen, was er f�r einen Typ m�chte
public class BoxWildcard<T> {
	private T element;
	
	public BoxWildcard() {
		super();
	}

	public BoxWildcard(T element) {
		this.element = element;
	}

	public T getElement() {
		return element;
	}

	public void setElement(T element) {
		this.element = element;
	}	
}
