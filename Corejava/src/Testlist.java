import java.util.ArrayList;
import java.util.List;

public class Testlist {
	public static void main(String[] args) {
		List list  = new ArrayList();
		
		list .add("one");
		System.out.println("list="+list);
		System.out.println();
		
		
		
		list.add("abhishek");
		System.out.println("LIST ="+list);
		System.out.println("list.get at 1 index ="+list.get(1));
		
		System.out.println();
		
		
		list.add("abhishek");
		list.add("uady");
		list.add("anish");
		
		list.add("ankush");
		
		
		list.add(1000);
		
		
		System.out.println("list="+list);
		
		System.out.println();
		
		
		
		
	}

}
