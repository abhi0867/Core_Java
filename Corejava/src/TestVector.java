import java.util.Enumeration;
import java.util.Vector;

public class TestVector {

	public static void main(String[] args) {
		
			Vector v = new Vector();
			
			v.add("one");
			v.add(200);
			v.add("two");
			v.add(1000);
			
			Enumeration e =v.elements();
			
			v.add(100);
			
			while(e.hasMoreElements()) {
				
				System.out.println(e.nextElement());
			}
	}
}
