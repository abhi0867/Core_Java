package in.co.Thread;

public class TestHiBylambda {

	public static void main(String[] args) {
		
		Hi h = new Hi() {
			
			public  void sum(int a, int b) {
				
				
			}
		};
		
		h.defMethod();
		
		Hi.staticMethod();
	}
}
