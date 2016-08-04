import java.util.Collections;
import java.util.Vector;


class Customer12 implements Comparable
{
 int id;
 String name;
 String city;
 double salary;
 public String toString()
 {
	 String x=id+ ":"+name+":"+city+":"+salary;
	return x;
	 
 }
	@Override
	public int compareTo(Object o) {
		Customer12 co=(Customer12)o;
		int ret=this.name.compareTo(co.name);
		return ret;
//		double sal=co.salary;
//		String nm=co.name;
//		if(this.salary<sal)
//		{
//			return -1;
//	}
//		else
//			if(this.salary>sal)
//			{
//				return 1;
//			}
//			else
//			{
//		return 0;
//			}
	}
//	
}




public class ComparableTest2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Vector v= new Vector();
		Customer12 c1= new Customer12();
		c1.id=100;
		c1.name="Rahul";
		c1.city="Banglore";
		c1.salary=25000;
		Customer12 c2= new Customer12();
		c2.id=50;
		c2.name="Arun";
		c2.city="Kochi";
		c2.salary=85000;
		Customer12 c3= new Customer12();
		c3.id=10;
		c3.name="Alen";
		c3.city="DELHI";
		c3.salary=15684;
		Customer12 c4= new Customer12();
		c4.id=22;
		c4.name="Arjun";
		c4.city="Alleppy";
		c4.salary=35000;
		Customer12 c5= new Customer12();
		c5.id=22;
		c5.name="Sreenath";
		c5.city="Mumbai";
		c5.salary=45000;
		
		v.add(c1);
		v.add(c2);
		v.add(c3);
		v.add(c4);
		v.add(c5);
		System.out.println(v);
		Collections.sort(v);
		System.out.println(v);
	
		

	}

}
