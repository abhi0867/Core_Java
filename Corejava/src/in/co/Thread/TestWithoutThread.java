package in.co.Thread;

public class TestWithoutThread {
public static void main(String[] args) {
	
	WithoutThread t1= new WithoutThread("abhi");
	WithoutThread t2= new WithoutThread("parmar");
	
	t2.run();
	t1.run();
	
}
}
