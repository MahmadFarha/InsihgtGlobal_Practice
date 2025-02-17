package com.ig.ui;

import com.ig.exception.AccountNotFoundException;
import com.ig.exception.InsufficientFundsException;
import com.ig.exception.InvalidAmountException;
import com.ig.exception.LowBalanceException;
import com.ig.model.Account;
import com.ig.model.Account.AccountType;
import com.ig.service.AccountService;

public class AccountTest {

    public static void main(String[] args) {
        try {

            AccountService accountService = new AccountService();

            
            Account acc1 = new Account(1, "John", AccountType.Savings, 1500f);  
            Account acc2 = new Account(2, "Jane", AccountType.Current, 6000f);  
            Account acc3 = new Account(3, "Doe", AccountType.Savings, 2000f);   
            Account acc4 = new Account(4, "Smith", AccountType.Current, 10000f); 

        
            Account acc5 = null;
            try {
                acc5 = new Account(105, "Alice", AccountType.Savings, 900f);  
            } catch (LowBalanceException e) {
                System.out.println(e.getMessage()); 
            }

            
            accountService.accountList.add(acc1);
            accountService.accountList.add(acc2);
            accountService.accountList.add(acc3);
            accountService.accountList.add(acc4);

           
            if (acc5 != null) {
                accountService.accountList.add(acc5); 
            }

            System.out.println(String.format("Is account  %d valid", 4));

            accountService.deposit(1, 500f); 
            System.out.println("New balance of Account 1 is: " + accountService.getBalance(1)); 

        
            accountService.withdraw(3, 1200f); 
            System.out.println("New balance of Account 1 after withdrawal: " + accountService.getBalance(1)); 

           
            try {
                accountService.withdraw(4, 400f); 
            } catch (InvalidAmountException | InsufficientFundsException | AccountNotFoundException e) {
                System.out.println(e.getMessage()); 
            }

            
            try {
                accountService.withdraw(4, 12000f);  
            } catch (InvalidAmountException | InsufficientFundsException | AccountNotFoundException e) {
                System.out.println(e.getMessage()); 
            }

            
            try {
                accountService.withdraw(1, 1000f);  
                System.out.println("New balance of Account 101 after successful withdrawal: " + accountService.getBalance(1)); 
            } catch (InvalidAmountException | InsufficientFundsException | AccountNotFoundException e) {
                System.out.println(e.getMessage());
            }

        } catch (LowBalanceException | InvalidAmountException | AccountNotFoundException | InsufficientFundsException e) {
            System.out.println(e.getMessage()); 
        }
    }
}
