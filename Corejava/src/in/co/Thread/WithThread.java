
package in.co.Thread;

public class WithThread extends Thread{
	
	String name = null;
	
	public WithThread(String name) {
		
		this.name = name;
		
		
	}
	public void run() {
		
		for (int i = 1; i < 10; i++) {
			
			
			System.out.println(i+""+name);
			
			
		}
		
	}
		
		
	}

}
