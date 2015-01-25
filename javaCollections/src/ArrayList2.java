import java.util.ArrayList;

public class ArrayList2 {
	public static void main(String args[]) {
		System.out.println("ArrayList Example");
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("four");//shows duplicate
		
		System.out.print("Add List: ");
		
		for(String str: list) {
			System.out.print(str + "\t");
		}
		
		System.out.print("\nElimination and change: ");
		
		list.remove(3);
		list.set(2, "haha");
		list.add(2,"num");
		
		for(String str: list) {
			System.out.print(str+ "\t");
		}
		
		System.out.print("\nContains 'o': ");
		for(String str: list) {
			if(str.indexOf("o")!=-1) {
				System.out.print(str+"\t");
			}
		}
	}
}
