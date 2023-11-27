import java.util.Comparator;

public class Employee implements Comparable<Employee> { 

	
	private int id =0;
	private  String name = null;
	private int Salary = 0;
	
	public Employee (int id , int salary, String name) {
		this.id =id;
		this.name=name;
		this.Salary= salary;
		
		
	}
	public int getId() {
		return id ;
		
	}
	public String getName() {
		return name;
	}
	public int getSalary() {
		return Salary;
		
	}
	public String toString() {
		return id +" "+ name + "" + Salary;
	}@Override

	
	
	public int compareTo(Employee o) {
		int i = this.name.compareTo(o.name);
		
		if (1==0) {
			return this.Salary - o.Salary;
			
			
		}
	
		return i ;
	}
	
	@Override
	public int hashCode() {
		String str = this.id + this.name +this.Salary;
		return super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Employee)) {
		return  false;
		
		}
		Employee e= (Employee)obj;
		boolean b =this.id==e.id && this.name == e.name && this.Salary == e.Salary;
		return b;
		
		
		
		
	}}
		
	
	

	
		
		
		
	

