package exam;

public enum ComfortLevel {
	MIN(0), AVG(1), MAX(2);
	
	private int index;
	private ComfortLevel(int i) {
	   this.index = i;
	}
}
