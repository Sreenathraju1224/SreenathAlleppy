import java.util.*;
import java.awt.Frame;
import java.awt.Label;
import java.text.*;
public class ClaenderDemo {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		Calendar c=new GregorianCalendar(2016,6,28);
		System.out.println(c.getFirstDayOfWeek());
		System.out.println(c.getWeeksInWeekYear());
		System.out.println(c.getTime());
		System.out.println(c.get(Calendar.MONTH));
		Frame f=new Frame("My Clock");
		Label tf=new Label();
		f.add(tf);
		f.setVisible(true);
		while(true)
		{
			c=new GregorianCalendar();
			tf.setText((c.get(Calendar.HOUR)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND)));
			Thread.sleep(1000);
		}
		
	}

}
