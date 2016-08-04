import java.util.*;
import java.io.*;
public class Collecton12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	//Vector v= new Vector();
	ArrayList v= new ArrayList();
	v.add("zyaan");
	v.add("Arun");
	v.add("Jesvin");
	v.add("Sreenath");
	System.out.println(v);
	Collections.shuffle(v);
	
	System.out.println(v);
	Collections.reverse(v);
	System.out.println(v);
	Collections.rotate(v, 2);
	System.out.println(v);
	}

}
