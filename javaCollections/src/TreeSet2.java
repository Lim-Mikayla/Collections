import java.util.TreeSet;
import java.util.Iterator;

public class TreeSet2 {
	public static void main(String[] args ) {
		System.out.println("TreeSet Example: ");
		
		TreeSet names = new TreeSet();
		
		names.add("Zach");
		names.add("Maria");
		names.add("April");
		names.add("Jeanie");
		names.add("Alex");
		names.add("Alex");
		
		System.out.println("Number of people in this list: " + names.size());
		System.out.print("Names of the students: ");
		
		Iterator ite = names.iterator();
		while(ite.hasNext()) {
			System.out.print(ite.next()+ " ");
		}
		System.out.println();
		
		names.remove("Maria");
		
		System.out.println("Number of people in the list after Maria transferred: " + names.size());
		System.out.print("Names of the students: ");
		
		ite = names.iterator();
		while(ite.hasNext()) {
			System.out.print(ite.next()+ " ");
		}
		
				
	}
}
