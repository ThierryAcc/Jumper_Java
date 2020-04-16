package generics;


public class BoxObject {
	// Vorteil, ich kann jedes Objekt verwenden
	// Nachteil, ich weiss nicht was genau drin ist, ich muss alles casten
	Object element;
	
	
	
	public BoxObject() {
		super();
	}

	public BoxObject(Object element) {
		super();
		this.element = element;
	}

	public Object getElement() {
		return element;
	}

	public void setElement(Object element) {
		this.element = element;
	}
	
	

}
