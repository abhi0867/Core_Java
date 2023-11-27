import java.util.Comparator;

public class OrderByid implements Comparator <Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.getId()- o2.getId();
	
	}
}
	class OrderByNameAsc implements Comparator <Employee>{

		@Override
		public int compare(Employee o1, Employee o2) {
			
			return o1.getName().compareTo(o2.getName());
		}
	}
	class OrderByNameDsc implements Comparator <Employee>{

		@Override
		public int compare(Employee o1, Employee o2) {
			
			return o2.getName().compareTo(o1.getName());
		}
	}
	class OrderBysalary implements Comparator<Employee>{

		@Override
		public int compare(Employee o1, Employee o2) {
			
			return o2.getSalary() - o1.getSalary();
		}
		
	}
	

	
	

