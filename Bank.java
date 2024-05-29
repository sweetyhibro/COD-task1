package com.bankingsystem;

import java.util.HashMap;
import java.util.Map;

public class Bank {
    private Map<Integer, Account> accounts;

    public Bank() {
        accounts = new HashMap<>();
    }

    public Account createAccount(String name, double initialDeposit) {
        Account newAccount = new Account(name, initialDeposit);
        accounts.put(newAccount.getAccountNumber(), newAccount);
        return newAccount;
    }

    public Account getAccount(int accountNumber) {
        return accounts.get(accountNumber);
    }
}
