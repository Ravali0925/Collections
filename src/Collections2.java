import java.util.LinkedList; // Importing the package

public class Collections2 { // main class
	public static void main(String[] args) { // Main method
		LinkedList<Integer> ravali = new LinkedList<Integer>();
		ravali.add(15); // Adding the value to Linkedlist
		ravali.add(20);  // Adding the value to Linkedlist
		ravali.add(25);  // Adding the value to Linkedlist
		ravali.add(30);  // Adding the value to Linkedlist
		System.out.println("Linked List - "+ ravali);
		int value = ravali.element();
		System.out.println("Head of the list - " + value); 
		System.out.println(ravali.getFirst()); // printing the data
		System.out.println(ravali.getLast()); // printing the data
		System.out.println(ravali.get(3)); // printing the data
		// clone method
		LinkedList<Integer> dup = new LinkedList<Integer>();
		dup = (LinkedList<Integer>)ravali.clone();
		System.out.println("duplicate" + dup);
		dup.addFirst(22);
		System.out.println("duplicate ravali" + dup);
		System.out.println("Linked List -" + ravali);
		ravali.addFirst(123);
		System.out.println("Linked List -" + ravali);
		System.out.println(dup.removeLast());
		System.out.println("duplicate ravali" + dup);

	}
}
