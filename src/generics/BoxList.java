package generics;

import java.util.ArrayList;
import java.util.List;

public class BoxList<T> {
	public List<T> list;

	public BoxList() {
		super();
	}

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}


	

}
