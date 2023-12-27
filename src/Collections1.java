import java.util.ArrayList;// Importing the package
import java.util.Collections;
import java.util.Iterator;

public class  Collections1 { // Main class
	public static void main(String[] args) { // Main method
		
		ArrayList<String> flowers = new ArrayList<String>();
		flowers.add("Rose");//This method add rose to the ArrayList.
		flowers.add("Mari gold"); //This method add mari gold to the ArrayList.
		flowers.add("Jasmin"); //This method add jasmin to the ArrayList.
		System.out.println(flowers.size()); // get the size
		System.out.println(flowers);
		System.out.println(flowers.get(2)); // get the index value
		flowers.set(2, "lilly");
		System.out.println(flowers);
		flowers.remove(1); // remove the index position of 1
		System.out.println(flowers);
		flowers.add("Hibiscus");
		flowers.add("Lotus");
		flowers.add("Tulip");
		System.out.println(flowers);
		// using For Loop size method
		System.out.println("*********************");
		for(int i=0;i<flowers.size();i++)
		{
			System.out.println(flowers.get(i));
		}
		// without using size method
		System.out.println("*********************");
		for(String data : flowers) // i = 10
		{
			System.out.println(data);
		}
		// Iterator
		System.out.println("******************");
		Iterator<String> it = flowers.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("***********************");
		// Using forEach() Method
		flowers.forEach((a)->System.out.println(a));
		System.out.println("***********************");
		Collections.sort(flowers);
		System.out.println(flowers);	
	
	}
}

