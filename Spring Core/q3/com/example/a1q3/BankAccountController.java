package com.example.a1q3;

public class BankAccountController {
	private BankAccountService bankAccountService;

	public BankAccountController(BankAccountService bankAccountService) {
		this.bankAccountService = bankAccountService;
	}

	public double deposit(long accountId, double balance) {
		return bankAccountService.deposit(accountId, balance);
	}
	
	public double getBalance(long accountId) {
		// TODO Auto-generated method stub
		return bankAccountService.getBalance(accountId);
	}

}
