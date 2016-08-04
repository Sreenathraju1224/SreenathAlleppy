import java.util.*;
import java.io.*;
public class ColorShape {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		ColourShpae cs=new ColourShpae();
		cs.color="Orange";
		cs.shape="Rectangle";
		ColourShpae cs1=new ColourShpae();
		cs1.color="Green";
		cs1.shape="Triangle";
		ColourShpae cs2=new ColourShpae();
		cs2.color="Red";
		cs2.shape="Circle";
		ColourShpae cs3=new ColourShpae();
		cs3.color="Pink";
		cs3.shape="Square";
		ColourShpae cs4=new ColourShpae();
		cs4.color="Blue";
		cs4.shape="Elipse";
		ColourShpae cs5=new ColourShpae();
		cs5.color="Yellow";
		cs5.shape="Cylender";
		HashMap hm=new HashMap();
		hm.put(1, cs1);
		hm.put(2, cs2);
		hm.put(3, cs3);
		hm.put(4, cs4);
		hm.put(5, cs5);
		
		System.out.println("Enter the colour");
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(isr);
		String colour = (String)br.readLine();
		Set key=hm.keySet();
		Iterator it=key.iterator();
		int epm=0;
		
		while (it.hasNext())
		{
			int key1=(Integer)it.next();
			ColourShpae css=(ColourShpae)hm.get(key1);
		String shape=css.color	;
		if(colour.equalsIgnoreCase(shape))
		{
	 String colShape=css.shape;
	System.out.println(colShape);
			epm++;
		}
		
	}
		
		if(epm==0)
		{
			 
			System.out.println("No such Color");
		}
			
	}

}
