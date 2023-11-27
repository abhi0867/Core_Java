package com.rays.exception;

public class Account {

	private int balance ;
	private String accountNumber ;
	
	public Account() {
		System.out.println("in default constructor");
		
	}
	public Account (int balance,String accountNumbre) {
		this.balance =balance;
		this.accountNumber=accountNumber;
		
	}

public void setAccountNumder (String accountnumber) {
	this.accountNumber=accountnumber;
}

public String getAccountNumber() {
	return accountNumber;
	
}
public void setBalance(int balance) {
	this.balance=balance;
	
}
public int getBalance() {
	return balance;
	
}
public void deposite (int amount) {
	int total= getBalance()+amount;
	setBalance(total);
	System.out.println("Balance after deposite =" + getBalance());
}
  public void Withrawl(int amount )throws InsufficientBalance{
	  int total= getBalance()-amount;
	  if(total<7000) {
		  throw new InsufficientBalance();
	  
	  }
	  else {
		  setBalance(total);
		  System.out.println("Balance after Withdrawl ="+getBalance());
		  
	  }
	  
	
}

}