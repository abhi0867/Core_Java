
package in.com.collection;





import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TestCollection {
public static void main(String[] args) {
	Collection C1 = new ArrayList();
	C1.add(1);
	C1.add('a');
	C1.add("Abhi");
	C1.add("byyy");
	Collection C2  = new ArrayList ();
	C2.add(2);
	C2.add('b');
	C2.add("hyyy");
	C2.add("shek");
	
	System.out.println("c1= "+C1);
	System.out.println("c2= "+C2);
	C1.addAll(C2);
	System.out.println(C1);
	//C1.clear();
	//System.out.println(C1);
	System.out.println(C1.contains("Abhi"));
	System.out.println(C1.containsAll(C2));
	System.out.println(C1.isEmpty());
	System.out.println(C1.iterator());
	System.out.println(C1.remove("Abhi"));
	System.out.println(C1.removeAll(C2));
	System.out.println(C1.retainAll(C2));
	System.out.println(C1.size());
	
	
	
	

	
	
	
	
	Iterator i = C1.iterator();
	while(i.hasNext()) {
		Object o = i. next();
	}
	
	
}
}
