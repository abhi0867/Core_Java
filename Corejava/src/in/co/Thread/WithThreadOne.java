package in.co.Thread;

public class WithThreadOne extends Thread {
	
	String name = null;
	
	int i = 1;
	
	public  WithThreadOne(String name) {
		
		this.name=name;
	}
	
	public void run() {
		
		while (true) {
			
			try {
				Thread.sleep(400);
				
			} catch (InterruptedException e) {
				e.printStackTrace();
				
				System.out.println(i + "" + name);
				
				i++;
			}
		}
	}

}
