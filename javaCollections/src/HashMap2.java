import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap2 {
	public static void main(String[] args) {
		
		HashMap<String, Integer> hmap = new HashMap<String, Integer>();
		
		hmap.put("Maria", 21);
		hmap.put("Alex", 35);
		hmap.put("Zach", 40);
		hmap.put("April", 14);
		hmap.put("April", 14);//does not show duplicate
		
		System.out.println("How many people in the list?");
		System.out.println("There are " + hmap.size() + " people in the list.");
		System.out.println();
		
		System.out.println("The following is the people's name and age.");
		
		Iterator<String> strIterator = hmap.keySet().iterator();
		
		while(strIterator.hasNext()) {
			String key = strIterator.next();
			System.out.println("Name: " + key + " Age: " + hmap.get(key));
		}
	    System.out.println();
	    
		System.out.println("How old is Maria?");
		
		String key = "Maria";
		Integer value = hmap.get(key);
		System.out.println("Name: " + key +" Age: "+ value);
		
	}
}
