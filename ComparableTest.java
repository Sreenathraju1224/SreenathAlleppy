import java.util.*;

class Customer implements Comparable
{
 int id;
 String name;
 String city;
 public String toString()
 {
	 String x=id+ ":"+name+":"+city;
	return x;
	 
 }
	@Override
	public int compareTo(Object o) {
		Customer co=(Customer)o;
		int id1=co.id;
		if(this.id<id1)
		{
			return -1;
		}
		else
			if(this.id>id1)
			{
				return 1;
			}
			else
			{
		return 0;
			}
	}
	
}




public class ComparableTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Vector v= new Vector();
		Customer c1= new Customer();
		c1.id=100;
		c1.name="Rahul";
		c1.city="Banglore";
		Customer c2= new Customer();
		c2.id=50;
		c2.name="Arun";
		c2.city="Kochi";
		Customer c3= new Customer();
		c3.id=10;
		c3.name="Alen";
		c3.city="DELHI";
		Customer c4= new Customer();
		c4.id=22;
		c4.name="Arjun";
		c4.city="Alleppy";
		
		v.add(c1);
		v.add(c2);
		v.add(c3);
		v.add(c4);
		System.out.println(v);
		Collections.sort(v);
		System.out.println(v);
		

	}

}

