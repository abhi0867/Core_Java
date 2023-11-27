import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestEmployee {
	public static void main(String[] args) {
		Employee e1 =new Employee(1, 25000,"ram");
		Employee e2 =new Employee(2, 30000,"abhi");
		Employee e3 =new Employee(3, 40000,"uday");
		Employee e4 =new Employee(4, 39888,"abhishek");
		
		 List list =new ArrayList();
		 
		 list.add(e1);
		 list.add(e2);
		 list.add(e3);
		 list.add(e4);
		 
		 Iterator it =list.iterator();
		 while(it.hasNext()) {
		Object object = it .next();
		
		Employee e =(Employee)object;
		 System.out.println(e.getId());
		 System.out.println("\t" + e.getSalary());
		 System.out.println("\t" + e.getName());

		 
		 
		 
		 
	}
	
	}


}