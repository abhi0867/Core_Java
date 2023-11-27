import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestOrderEmployee {
	public static void main(String[] args) {
		Employee e1 = new Employee (1,13000,"kanak");
		Employee e2 = new Employee (2,35000,"uday");
		Employee e3 = new Employee (3,40000,"anish");
		Employee e4 = new Employee (4,100000,"abhi");
		
		List list = new ArrayList();
		

		list.add(e1);
		
		list.add(e2);
		
		list.add(e3);
		
		list.add(e4);
		
		Collections.sort(list,new OrderBysalary());
		
		Iterator it =list.iterator();
		
		while (it.hasNext()) {
			Object object = it.next();
			
			Employee e= (Employee)object;
			
			System.out.println(e);
			
		}
		
	
	}
		
		
	}


