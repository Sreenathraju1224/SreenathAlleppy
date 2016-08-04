import java.util.*;
public class ArrayList12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList al1=new ArrayList(5);
		al1.add("Arun");
		al1.add("Raj");
		al1.add("Peter");
		al1.add("Sreenath");
		
		System.out.println(al1);
		Collections.sort(al1);
		System.out.println(al1);
		
		

	}

}
