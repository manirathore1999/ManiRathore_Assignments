package com.example.a1q4;

public interface BankAccountRepository {
	
	public double getBalance(long accountId);
	public double updateBalance(long accountId, double newBalance);
	

}
