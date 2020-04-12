package misc.javadocs;

//single line

/*
* multi
* line
* comment
*/

/**
* This class is just an example class
* 
* @author thierry.bitz
* @version 0.1
*/
public class MyCrazyJavaDocsClassYes {

	/**
	 * This field is weird
	 */
	private int myField = 0;
	
	/**
	 * Converts an int to a String
	 * 
	 * @param x only use prime number
	 * @return x converted to String
	 */
	public String getCrazySomething(int x) {
		this.myField = x;
		return String.valueOf(x);
	}
}
