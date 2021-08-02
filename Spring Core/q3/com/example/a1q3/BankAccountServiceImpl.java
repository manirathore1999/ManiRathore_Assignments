package com.example.a1q3;

public class BankAccountServiceImpl implements BankAccountService {

	private BankAccountRepository repo;
	
	public BankAccountServiceImpl(BankAccountRepository repo) {
		this.repo = repo;
	}

	@Override
	public double withdraw(long accountId, double balance) {
		double accBalance = repo.getBalance(accountId);
		double newBalance = accBalance - balance;
		repo.updateBalance(accountId, newBalance);
		return newBalance;
	}

	@Override
	public double deposit(long accountId, double balance) {
		double accBalance = repo.getBalance(accountId);
		double newBalance = accBalance + balance;
		repo.updateBalance(accountId, newBalance);
		return newBalance;
	}

	@Override
	public double getBalance(long accountId) {
		return repo.getBalance(accountId);
	}

	@Override
	public boolean fundTransfer(long fromAccount, long toAccount, double amount) {
		// TODO Auto-generated method stub
		double fromBalance = repo.getBalance(fromAccount)-amount;
		double toBalance = repo.getBalance(toAccount)+amount;
		return true;
	}


}
