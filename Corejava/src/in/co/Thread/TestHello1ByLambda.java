package in.co.Thread;

public class TestHello1ByLambda {
	
	public static void main(String[] args) {
		
		Hello1 h = (a,b) -> {
			
			int c =a + b;
			
			System.out.println("sum="+c);
			
			
			
		};
		
		h.sum(10,20);
	}

}
