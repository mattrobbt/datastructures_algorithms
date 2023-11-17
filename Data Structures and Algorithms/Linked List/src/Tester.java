/**
 * 
 */

/**
 * @author matthewrobb
 *
 */
public class Tester {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		List myList;
		myList = new List();
		myList.addToList("03124", 25);
		myList.addToList("03125", 75);
		myList.addToList("03126", 15);
		myList.addToList("03127", 95);
		myList.printList();
		myList.findNode("03126");
	}

}
