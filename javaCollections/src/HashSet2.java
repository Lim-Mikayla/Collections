import java.util.HashSet;
import java.util.Iterator;

public class HashSet2 {
	public static void main (String[] args) {
		System.out.println("HashSet Example: ");
		
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("one");
		hs.add("two");
		hs.add("three");
		hs.add("four");
		hs.add("four");//no duplicate
		
		System.out.println("How many: " + hs.size());
		
		Iterator ite = hs.iterator();
		while(ite.hasNext()) {
			System.out.print(ite.next() + "\t");
		}
		System.out.println();
		
		hs.add("five");
		hs.remove("one");
		for(String str: hs) {
			System.out.print(str+"\t");
		}
		
	}
}
