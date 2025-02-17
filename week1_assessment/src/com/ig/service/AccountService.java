package com.ig.service;

import com.ig.model.Account;
import com.ig.exception.AccountNotFoundException;
import com.ig.exception.InsufficientFundsException;
import com.ig.exception.InvalidAmountException;
import java.util.ArrayList;
import java.util.List;

public class AccountService {
    public List<Account> accountList = new ArrayList<>();  

    public boolean isValidAccount(int accNumber) {
        for (Account account : accountList) {
            if (account.getAccNumber() == accNumber) {
                return true;
            }
        }
        return false;
    }

    
    public void deposit(int accNumber, float amt) throws AccountNotFoundException, InvalidAmountException {
        Account account = findAccount(accNumber);
        if (amt < 0) {
            throw new InvalidAmountException("Amount cannot be negative");
        }
        account.setBalance(account.getBalance() + amt);
    }

    
    public void withdraw(int accNumber, float amt) throws AccountNotFoundException, InsufficientFundsException, InvalidAmountException {
        Account account = findAccount(accNumber);
        if (amt < 500) {
            throw new InvalidAmountException("Minimum withdrawal amount is 500");
        }
        if (account.getType() == Account.AccountType.Savings && account.getBalance() - amt < 1000) {
            throw new InsufficientFundsException("Insufficient funds in Savings account");
        } else if (account.getType() == Account.AccountType.Current && account.getBalance() - amt < 5000) {
            throw new InsufficientFundsException("Insufficient funds in Current account");
        }
        account.setBalance(account.getBalance() - amt);
    }

  
    public float getBalance(int accNumber) throws AccountNotFoundException {
        Account account = findAccount(accNumber);
        return account.getBalance();
    }

  
    private Account findAccount(int accNumber) throws AccountNotFoundException {
        for (Account account : accountList) {
            if (account.getAccNumber() == accNumber) {
                return account;
            }
        }
        throw new AccountNotFoundException("Account not found");
    }
}
