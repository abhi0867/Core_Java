


package in.co.Thread;



public class Account {

	int balance1 = 0;
	
	 public void setBalance(int balance) {
		 try {
			 Thread.sleep(200);
			 
		 }catch(InterruptedException e) {
			 //TODO auto-generated catch block
			 e.printStackTrace();
			 
		 }
		 this.balance1=balance1;
		 
		 
	 }
	public int getbalance() {
		try {
			Thread.sleep(200);
		
		
		} catch
	(InterruptedException e) {
			e.printStackTrace();
		}
		return balance1;
		
	
}


public synchronized  void deposite(String msg ,int amount) {
	int tOtal = getbalance()+amount;
	
	
	
	setBalance(tOtal);
	
	System.out.println(msg+"balance= "+getbalance());
}



}