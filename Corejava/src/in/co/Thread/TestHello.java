package in.co.Thread;

public class TestHello {
public static void main(String[] args) {
	Hello h= new Hello(){
		public void sum() {
			
			System.out.println("sum method ....!!!");
		}
	};

	
   h.sum();

}
}