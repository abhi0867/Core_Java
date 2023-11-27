package in.co.Thread;

public class Customer1 implements Cloneable {
	String name = null;
	
	
	Account account = new Account ();
	public Customer1(String name, int balance1) {
		this.name=name;
		this.account.balance1 = balance1;
		
	}
		
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Customer1 c = (Customer1)super.clone();
		return super.clone();
	}

}


