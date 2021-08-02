package com.example.a1q4;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;
@Component
public class BankAccountRepositoryImpl implements BankAccountRepository {
	private static Map<Long, Double> accountBalance;
	static {
		accountBalance = new HashMap<>();
		accountBalance.put((long) 1, 500.0);
		accountBalance.put((long) 2, 700.0);
		accountBalance.put((long) 1, 1000.0);
		
	}

	@Override
	public double getBalance(long accountId) {
		return accountBalance.get(accountId);
	}

	@Override
	public double updateBalance(long accountId, double newBalance) {
		accountBalance.put(accountId, newBalance);
		return newBalance;
	}

}
