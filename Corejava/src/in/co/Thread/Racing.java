package in.co.Thread;

public class Racing extends Thread {
	
	String name = null;
	
	public  Account account = new Account();
	
	public Racing(String name) {
		this.name=name;
		
	}
	@Override
	public void run() {
		for (int i = 1; 1 <= 5; i++) {
			
			 account.setBalance(1000);
			
		}
		
	}
			
			
		

	}


