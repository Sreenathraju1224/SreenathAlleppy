
import java.util.*;
public class ArrayList11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//	ArrayList al1= new ArrayList(10);
//	al1.add("ust");
//	al1.add("SREE");
//	al1.add("guru");
//	al1.add("ust");
//	al1.add("ust");
////	al1.toArray();
////	String a="UST";
//	Collections.fill(al1, "Ust");
//	
//	System.out.println(al1);
//		LinkedHashMap hs=new LinkedHashMap();
//		hs.put(1, "Sreenath");
//		hs.put(2,"Bony");
//		hs.put(3,"Aswathy");
//		hs.put(4,"Revathy");
//		hs.put(5,"Ninu");
//		hs.put(6,"Arjun");
//		System.out.println("The Entries ih LinkedHashMap  are " +hs);

		
		TreeSet ts=new TreeSet();
		ts.add("Arjun");
		ts.add("Sreenath");
		ts.add("Alen");
		ts.add("Arun");
		ts.add("fihad");
		System.out.println(ts);
		
		TreeMap tm = new TreeMap();
		
		tm.put("Srithesh", new Double(3434.34));
		tm.put("Guru", new Double(123.22));
		tm.put("Prasad", new Double(1378.00));
		tm.put("Amit", new Double(99.22));
		tm.put("Ranjit", new Double(-19.08));
	
				Set set = tm.entrySet();
				Iterator i = set.iterator();
				while(i.hasNext()) {
		Map.Entry me = (Map.Entry)i.next();
		System.out.print(me.getKey() + ": ");
		System.out.println(me.getValue());
				}
	}

}
