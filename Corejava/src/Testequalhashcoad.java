
public class Testequalhashcoad {
public static void main(String[] args) {
	Employee e1= new Employee (1,14000,"kanak");
	
	Employee e2=new Employee(2,23000,"abhishek");
	
	Employee e3 =new Employee (3,3899,"uday");
	
	Employee e4 = new Employee (4,4500,"anish");
	
	
	String s ="java";
	
	System.out.println(e1.equals(s));
	
	System.out.println(e1.hashCode());
	
	System.out.println(e2.hashCode());
	
	System.out.println(e3.hashCode());
	
	System.out.println(e4.hashCode());
	
}
}
